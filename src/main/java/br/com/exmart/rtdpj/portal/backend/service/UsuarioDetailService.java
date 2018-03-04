package br.com.exmart.rtdpj.portal.backend.service;

import br.com.exmart.rtdpj.portal.backend.entity.Permissao;
import br.com.exmart.rtdpj.portal.backend.entity.Usuario;
import br.com.exmart.rtdpj.portal.backend.repository.PermissaoRepository;
import br.com.exmart.rtdpj.portal.backend.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioDetailService implements UserDetailsService {

    private static Logger log = LoggerFactory.getLogger(UsuarioDetailService.class.toString());
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PermissaoRepository permissaoRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        System.out.println(passwordEncoder.encode("1234"));
        log.info("Verificando login: " + email);
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario == null){
            log.info("Verificando login: Não encontrado" );
            throw new UsernameNotFoundException("Usuario: " + email + " não encontrado");
        }
        List<Permissao> rolesList = permissaoRepository.findByIdUser(usuario.getId());
        List<GrantedAuthority> permissoes = new ArrayList<>();
        for(Permissao role : rolesList){
            log.info("Permissao: " + role.getNome());
            permissoes.add(new SimpleGrantedAuthority(role.getNome()));
        }
        UserDetails userDetails = (UserDetails)new User(usuario.getEmail(),
                usuario.getSenha(), permissoes);
        return userDetails;
    }
}

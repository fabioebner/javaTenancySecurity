package br.com.exmart.rtdpj.portal.backend.repository;

import br.com.exmart.rtdpj.portal.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}

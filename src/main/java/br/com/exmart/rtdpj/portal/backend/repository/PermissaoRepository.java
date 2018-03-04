package br.com.exmart.rtdpj.portal.backend.repository;

import br.com.exmart.rtdpj.portal.backend.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    @Query(nativeQuery = true, value = "SELECT t.* FROM public.tb_permissao t JOIN public.tb_usuario_permissao u ON u.permissao_id = t.id WHERE u.usuario_id = ?1")
    List<Permissao> findByIdUser(Long id);
}

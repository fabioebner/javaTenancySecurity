package br.com.exmart.rtdpj.portal.backend.repository;

import br.com.exmart.rtdpj.portal.backend.entity.privado.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteRepository extends JpaRepository<Teste, Long> {
}

package br.com.exmart.rtdpj.portal.backend.controller;

import br.com.exmart.rtdpj.portal.backend.entity.privado.Teste;
import br.com.exmart.rtdpj.portal.backend.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private TesteRepository testeRepository;

    @RequestMapping(value = "/")
    public Teste vai(){
        return testeRepository.getOne(1L);
    }
}

package br.com.exmart.rtdpj.portal.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @RequestMapping(value = "/")
    public String vai(){
        return "foi";
    }
}

package br.com.exmart.rtdpj.portal.backend.entity.privado;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "teste")
public class Teste extends EntityBase{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

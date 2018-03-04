package br.com.exmart.rtdpj.portal.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_instituicao", schema = "public")
public class Permissao extends  AbstractEntity{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

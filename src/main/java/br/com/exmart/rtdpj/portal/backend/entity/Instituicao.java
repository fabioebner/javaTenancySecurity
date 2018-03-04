package br.com.exmart.rtdpj.portal.backend.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_instituicao", schema = "public")
public class Instituicao extends  AbstractEntity{
    private String nome;
    @OneToOne(fetch= FetchType.EAGER)
    @PrimaryKeyJoinColumn
    private TipoInstituicao tipo;
    private LocalDateTime cadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoInstituicao getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstituicao tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getCadastro() {
        return cadastro;
    }

    public void setCadastro(LocalDateTime cadastro) {
        this.cadastro = cadastro;
    }
}

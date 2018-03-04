package br.com.exmart.rtdpj.portal.backend.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_usuario", schema = "public")
public class Usuario extends  AbstractEntity{

    private String nome;
    private String email;
    private String senha;
    @Column(name = "lembrete_senha")
    private String lembreteSenha;
    private LocalDateTime cadastro;
    @OneToOne(fetch= FetchType.EAGER)
    private Instituicao instituicao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLembreteSenha() {
        return lembreteSenha;
    }

    public void setLembreteSenha(String lembreteSenha) {
        this.lembreteSenha = lembreteSenha;
    }

    public LocalDateTime getCadastro() {
        return cadastro;
    }

    public void setCadastro(LocalDateTime cadastro) {
        this.cadastro = cadastro;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}

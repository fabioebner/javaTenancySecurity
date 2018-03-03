CREATE TABLE tb_usuario(
    id SERIAL PRIMARY KEY,
    instituicao_id BIGINT REFERENCES tb_instituicao(id),
    nome VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    senha VARCHAR(250) NOT NULL,
    lembrete_senha VARCHAR(250) NOT NULL,
    cadastro TIMESTAMP WITHOUT TIME ZONE NOT NULL
);

INSERT INTO tb_usuario(instituicao_id, nome, email, senha, lembrete_senha, cadastro) VALUES (1,'cartorio','cartorio@teste.com.br','1234','14', now());
INSERT INTO tb_usuario(instituicao_id, nome, email, senha, lembrete_senha, cadastro) VALUES (2,'Pf','pf@teste.com.br','1234','14', now());
INSERT INTO tb_usuario(instituicao_id, nome, email, senha, lembrete_senha, cadastro) VALUES (3,'cliente','cliente@teste.com.br','1234','14', now());
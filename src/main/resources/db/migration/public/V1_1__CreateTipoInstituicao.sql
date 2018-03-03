CREATE TABLE tb_tipo_instituicao(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL
);

INSERT INTO tb_tipo_instituicao (nome) VALUES ('CARTORIO');
INSERT INTO tb_tipo_instituicao (nome) VALUES ('PESSOA FISICA');
INSERT INTO tb_tipo_instituicao (nome) VALUES ('CLIENTE');
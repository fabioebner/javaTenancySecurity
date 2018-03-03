CREATE TABLE tb_instituicao(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL,
    tipo_instituicao_id BIGINT REFERENCES tb_tipo_instituicao(id),
    cadastro TIMESTAMP WITHOUT TIME ZONE  NOT NULL
);

INSERT INTO tb_instituicao( nome, tipo_instituicao_id, cadastro) VALUES ('Cartorio',1, now());
INSERT INTO tb_instituicao( nome, tipo_instituicao_id, cadastro) VALUES ('Pessoa Fisica',1, now());
INSERT INTO tb_instituicao( nome, tipo_instituicao_id, cadastro) VALUES ('Cliente ',1, now());
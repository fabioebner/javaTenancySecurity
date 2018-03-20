CREATE TABLE tb_instituicao(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL,
    tipo_instituicao_id BIGINT REFERENCES tb_tipo_instituicao(id),
    cadastro TIMESTAMP WITHOUT TIME ZONE  NOT NULL,
    nome_schema VARCHAR(250) NOT NULL
);

CREATE SCHEMA db_1;
CREATE SCHEMA db_2;
CREATE SCHEMA db_3;

INSERT INTO tb_instituicao( nome, tipo_instituicao_id, cadastro,nome_schema) VALUES ('Cartorio',1, now(), 'db_1');
INSERT INTO tb_instituicao( nome, tipo_instituicao_id, cadastro,nome_schema) VALUES ('Pessoa Fisica',1, now(), 'db_2');
INSERT INTO tb_instituicao( nome, tipo_instituicao_id, cadastro,nome_schema) VALUES ('Cliente ',1, now(), 'db_3');
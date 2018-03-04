CREATE TABLE tb_permissao(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL
);

INSERT INTO tb_permissao (nome) VALUES ('ROLE_CARTORIO');
INSERT INTO tb_permissao (nome) VALUES ('ROLE_CLIENTE');

CREATE TABLE tb_usuario_permissao(
    id SERIAL PRIMARY KEY,
    permissao_id BIGINT REFERENCES tb_permissao(id),
    usuario_id BIGINT REFERENCES tb_usuario(id)
);

INSERT INTO tb_usuario_permissao (permissao_id, usuario_id) VALUES ( 1,1);
INSERT INTO tb_usuario_permissao (permissao_id, usuario_id) VALUES ( 2,2);
INSERT INTO tb_usuario_permissao (permissao_id, usuario_id) VALUES ( 2,3);
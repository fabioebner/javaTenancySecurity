CREATE TABLE tb_andamento(
  id SERIAL PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  publico boolean not null
);

INSERT INTO tb_andamento (nome, publico) VALUES ('EM ANDAMENTO', true);
INSERT INTO tb_andamento (nome, publico) VALUES ('ENCAMINHADO PARA REGISTRO', false);
INSERT INTO tb_andamento (nome, publico) VALUES ('AGUARDANDO PAGAMENTO', false);
INSERT INTO tb_andamento (nome, publico) VALUES ('PAGAMENTO EFETUADO', false);
INSERT INTO tb_andamento (nome, publico) VALUES ('REGISTRADO', true);

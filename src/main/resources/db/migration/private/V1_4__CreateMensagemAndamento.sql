CREATE TABLE tb_mensagem_andamento(
    id SERIAL PRIMARY KEY,
    mensagem_id BIGINT REFERENCES tb_mensagem(id),
    andamento_id BIGINT REFERENCES tb_andamento(id),
    instituicao_andamento_id BIGINT REFERENCES public.tb_instituicao(id),
    usuario_andamento_id BIGINT REFERENCES public.tb_usuario(id),
    dt_andamento TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    arquivo jsonb,
    dt_leitura TIMESTAMP WITHOUT TIME ZONE,
    usuario_leitura_id BIGINT REFERENCES tb_usuario(id)
);
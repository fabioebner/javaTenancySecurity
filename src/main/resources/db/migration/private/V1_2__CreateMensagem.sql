CREATE TABLE tb_mensagem(
    id SERIAL PRIMARY KEY,
    instituicao_remetente_id BIGINT REFERENCES public.tb_instituicao(id),
    usuario_remetente_id BIGINT REFERENCES public.tb_usuario(id),
    instituicao_destinatario_id BIGINT REFERENCES public.tb_instituicao(id),
    tipo_mensagem BIGINT REFERENCES tb_tipo_mensagem(id),
    data TIMESTAMP WITHOUT TIME ZONE  NOT NULL
);

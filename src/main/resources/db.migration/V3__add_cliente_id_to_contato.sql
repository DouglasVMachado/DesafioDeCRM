ALTER TABLE contato
ADD COLUMN cliente_id BIGINT NOT NULL;

ALTER TABLE contato
ADD CONSTRAINT fk_contato_cliente
FOREIGN KEY (cliente_id)
REFERENCES cliente(id);
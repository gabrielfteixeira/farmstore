-- cria tabela para os produtos

CREATE TABLE Product(
    id BIGSERIAL PRIMARY KEY,
    name varchar(100) NOT NULL,
    description TEXT,
    price DECIMAL(10,2)

);
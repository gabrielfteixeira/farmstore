CREATE TABLE Supplier(
    id BIGSERIAL PRIMARY KEY,
    name varchar(100) NOT NULL,
    ein varchar(50) NOT NULL,
    address varchar(255) NOT NULL
);
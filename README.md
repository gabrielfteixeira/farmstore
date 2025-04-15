# FarmStore

FarmStore é um e-commerce especializado na venda de produtos voltados para fazendas, oferecendo ferramentas, sementes, rações para animais, roupas de trabalho, fertilizantes e muito mais.

## Tecnologias Utilizadas

- **Linguagem**: Java 17
- **Framework**: Spring Boot
- **Banco de Dados**: PostgreSQL
- **Gerenciamento de Dependências**: Maven
- **Autenticação e Autorizacao**: Spring Security (JWT)
- **ORM**: Hibernate
- **API RESTful**: Spring Web

## Funcionalidades Principais

- Cadastro e gerenciamento de produtos
- Sistema de login e autenticação seguro
- Carrinho de compras
- Processamento de pedidos
- Integração com meios de pagamento
- Painel administrativo para gestão de vendas e estoque

## Como Rodar o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/gabrielfteixeira/farmstore.git
   ```
2. Entre no diretório do projeto:
   ```sh
   cd farmstore
   ```
3. Configure o banco de dados no arquivo `application.yaml`.
4. Instale as dependências:
   ```sh
   mvn clean install
   ```
5. Execute o projeto:
   ```sh
   mvn spring-boot:run
   ```

## Estrutura do Projeto

```
FarmStore/
├── .gitattributes
├── .gitignore
├── docker-compose.yml
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── farmstore/
        │           ├── config/
        │           ├── controllers/
        │           ├── dtos/
        │           ├── models/
        │           ├── repositories/
        │           ├── security/
        │           ├── services/
        │           └── utils/
        └── resources/
            └── application.yaml
```


## Contribuição

Contribuições são bem-vindas! Para contribuir:
1. Fork o repositório.
2. Crie uma branch: `git checkout -b minha-branch`.
3. Faça suas modificações e commit: `git commit -m 'Minha contribuicao'`.
4. Push para o repositório: `git push origin minha-branch`.
5. Abra um Pull Request.

## Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Desenvolvido com ❤️


# Atividade 1

## REST SPRING BOOT - SUCULENTAS

Este projeto é uma API REST construída com Spring Boot para gerenciar suculentas, criada como parte da matéria **Laboratório de Banco de Dados III**, ministrada pelo professor **Giuliano Bertoti**. A API permite a realização de operações CRUD (Create, Read, Update, Delete) em uma lista de suculentas, com o objetivo de aprender e praticar conceitos de desenvolvimento de APIs RESTful em Java.
  
## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada.
- **Spring Boot**: Framework usado para construir a API REST.
- **Thunder Client**: Extensão do VS Code utilizada para testar a API.

## Endpoints da API

Abaixo estão os principais endpoints disponibilizados pela API:

- `GET /suculentas` - Retorna a lista de todas as suculentas.
- `GET /suculentas/{id}` - Retorna uma suculenta específica pelo ID.
- `POST /suculentas` - Cadastra uma nova suculenta.
- `PUT /suculentas/{id}` - Atualiza as informações de uma suculenta existente.
- `DELETE /suculentas/{id}` - Remove uma suculenta da lista.

Algumas suculentas já foram instanciadas no Controller para o teste da tabela.
![controller](https://github.com/user-attachments/assets/1b5fd620-c6ce-43f3-ad82-bdadef1a8b8d)

## Testes com Thunder Client

### GET

![get](https://github.com/user-attachments/assets/607c94aa-62f4-413e-a08c-d62655f9d1e0)

### POST

![post1](https://github.com/user-attachments/assets/4244e5a1-765a-4c81-b6d3-b9524f0a9fe7)

### RESULTADO DO POST, VISUALIZANDO COM GET 

![post3](https://github.com/user-attachments/assets/24f19dfe-399f-4cca-bc7a-aaf386f906cf)

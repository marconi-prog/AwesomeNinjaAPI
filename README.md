# Awesome Ninja API 

> Uma lista organizada e prática de exemplos e recursos do projeto **Ninja API**, uma aplicação backend desenvolvida em **Spring Boot**, focada em cadastro e gerenciamento de ninjas.
> Este projeto está **finalizado** e demonstra boas práticas de arquitetura backend usando **Java + Spring Boot + JPA**, incluindo documentação automática com **Swagger**, containerização com **Docker** e configuração pronta para **Docker Compose**.
> **Nota**
> Este projeto é voltado para fins educacionais, aprendizado e portfólio. Não é recomendado para uso direto em produção sem adaptações de segurança e escalabilidade.
<!--lint disable awesome-toc-->


## Conteúdo

* [Visão geral do projeto](#visão-geral-do-projeto)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Estrutura do projeto](#estrutura-do-projeto)
* [Funcionalidades](#funcionalidades)
* [Endpoints principais](#endpoints-principais)
* [Como executar o projeto](#como-executar-o-projeto)
* [Próximos passos](#próximos-passos)

<img src="mascote.png" align="right" width="130">

## Visão geral do projeto

A **Ninja API** é uma API RESTful desenvolvida em Java utilizando Spring Boot. O objetivo do projeto é permitir o cadastro, listagem, atualização, busca e remoção de ninjas, aplicando boas práticas como separação de camadas (Controller, Service, Repository) e uso de JPA para persistência de dados.

## Tecnologias utilizadas

* **Java 17+**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **Swagger / OpenAPI 3** (documentação da API)
* **Docker**
* **Docker Compose**
* **Banco de dados**: MySQL / PostgreSQL
* **Maven**

## Estrutura do projeto

```
src/main/java
 └── com/seuprojeto/naruto
     ├── ninja
     │   ├── controller
     │   │   └── NinjaController.java
     │   ├── service
     │   │   └── NinjaService.java
     │   ├── repository
     │   │   └── NinjaRepository.java
     │   └── model
     │       └── NinjaModel.java
     │
     ├── missao
     │   ├── controller
     │   │   └── MissaoController.java
     │   ├── service
     │   │   └── MissaoService.java
     │   ├── repository
     │   │   └── MissaoRepository.java
     │   └── model
     │       └── MissaoModel.java
     │
     └── config
         └── SwaggerConfig.java
```


## Funcionalidades
```
* ✅ Cadastrar ninjas
* 📋 Listar todos os ninjas
* 🔍 Buscar ninja por ID
* ✏️ Atualizar informações do ninja
* ❌ Deletar ninja
* 🎯 Cadastrar missões
* 📋 Listar missões
* 🔗 Vincular missões a ninjas
* ❌ Remover missões
* 📄 Documentação automática da API com Swagger
* 🐳 Aplicação totalmente containerizada com Docker
* 🔄 Orquestração de serviços com Docker Compose
```

## Endpoints principais

| Método | Endpoint      | Descrição                |
| ------ | ------------- | ------------------------ |
| Método | Endpoint      | Descrição                |
| ------ | ---------     | -----------              |
| GET    | /ninjas       | Lista todos os ninjas    |
| GET    | /ninjas/{id}  | Busca ninja por ID       |
| POST   | /ninjas       | Cadastra um novo ninja   |
| PUT    | /ninjas/{id}  | Atualiza um ninja        |
| DELETE | /ninjas/{id}  | Remove um ninja          |
| GET    | /missoes      | Lista todas as missões   |
| POST   | /missoes      | Cadastra uma nova missão |
| PUT    | /missoes/{id} | Atualiza uma missão      |
| DELETE | /missoes/{id} | Remove uma missão        |

## Como executar o projeto

### Pré-requisitos

* Docker
* Docker Compose

### Executando com Docker Compose

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/ninja-api.git

# Entrar no projeto
cd ninja-api

# Subir aplicação + banco
docker compose up -d
```

A aplicação ficará disponível em:

```
http://localhost:8080
```

### Swagger (Documentação da API)

Após subir o projeto, a documentação interativa estará disponível em:

```
http://localhost:8080/swagger-ui.html
```

## Próximos passos

* 🚀 Projeto finalizado e pronto para demonstração

* 📌 Ideal para portfólio, entrevistas e estudos avançados

* 🔐 Implementar autenticação com Spring Security

* 📦 Criar DTOs e Mappers

* 🧪 Adicionar testes unitários

* 🐳 Dockerizar a aplicação

* 📄 Criar documentação com Swagger/OpenAPI

---

##  Comunidade e Suporte

Junte-se às nossas discussões da comunidade no GitHub para compartilhar ideias, fazer perguntas ou sugerir melhorias. Vamos construir algo incrível juntos!

[![Abrir Issues](https://img.shields.io/badge/Abrir%20Issues-blue?style=for-the-badge&logo=github)](https://github.com/marconi-prog/AwesomeNinjaAPI/issues)

Use o espaço de *issues* para relatar bugs, sugerir melhorias ou tirar dúvidas sobre o projeto 💬

---


<div align="center">
  <p>Feito com ❤️ por <a href="https://github.com/marconi-prog">Marconi Farias</a></p>
</div>

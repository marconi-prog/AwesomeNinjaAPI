# 🛵 MRDEL API  

> API RESTful para gerenciamento de usuários e produtos, desenvolvida em Java com Spring Boot, simulando o backend de um sistema de delivery.

> Projeto finalizado, com foco em boas práticas de desenvolvimento backend, incluindo segurança com JWT, controle de acesso por roles e persistência de dados com JPA/Hibernate.

> **Nota**  
> Projeto voltado para fins educacionais, aprendizado e portfólio. Não é recomendado para uso direto em produção sem ajustes adicionais de segurança e escalabilidade.

---

## 📚 Conteúdo

- Visão geral do projeto  
- Tecnologias utilizadas  
- Funcionalidades  
- Estrutura do projeto  
- Endpoints principais  
- Como executar o projeto  
- Consultas SQL utilizadas  
- Comunidade e suporte  

---

## 🔎 Visão geral do projeto

O MRDEL é uma API RESTful que atua como backend de um sistema de delivery.  
Ela permite o gerenciamento de usuários e produtos, oferecendo autenticação e autorização seguras utilizando JWT, com separação de permissões entre **ADMIN** e **CLIENTE**.

O projeto aplica conceitos de Programação Orientada a Objetos, arquitetura em camadas e boas práticas de desenvolvimento backend.

---

## 🚀 Tecnologias utilizadas

- Java 21+  
- Spring Boot  
- Spring Web  
- Spring Security + JWT  
- Spring Data JPA / Hibernate  
- PostgreSQL  
- Postman  
- Maven  
- Git & GitHub  

---

## 🧩 Funcionalidades

- Cadastro e autenticação de usuários  
- Autenticação baseada em JWT  
- Controle de acesso por perfil (ADMIN / CLIENTE)  
- Gerenciamento de produtos (CRUD)  
- Persistência de dados com JPA/Hibernate  
- Arquitetura em camadas (Controller, Service, Repository)  

---

## 🔗 Endpoints principais

| Método | Endpoint        | Descrição                     |
| ------ | --------------- | ----------------------------- |
| POST   | /auth/login     | Autenticação do usuário       |
| POST   | /auth/register  | Cadastro de usuário           |
| GET    | /products       | Lista todos os produtos       |
| POST   | /products       | Cadastra novo produto (ADMIN) |
| PUT    | /products/{id}  | Atualiza produto (ADMIN)      |
| DELETE | /products/{id}  | Remove produto (ADMIN)        |

---

## ⚙️ Como executar o projeto

### Pré-requisitos

- JDK 21+
- Maven
- PostgreSQL

# ✅ ToDo List API (Spring Boot)

Este projeto é uma **API REST** para gerenciamento de tarefas (To-Do List), desenvolvida em **Java com Spring Boot**.  
Ela permite criar, listar, atualizar e excluir tarefas, armazenando os dados em um banco relacional.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Função |
|----------|--------|
| Java 21 | Linguagem principal |
| Spring Boot | Framework principal |
| Spring Web | Criação de API REST |
| Spring Data JPA | Persistência com ORM |
| MySQL | Banco de dados principal |
| H2 Database | Utilizado em testes |
| Spring Validation | Validação de dados de entrada |
| Spring Boot Actuator | Monitoramento da aplicação |
| WebTestClient | Testes Web (WebFlux para testes) |

---

## 📁 Estrutura do Projeto

```
src/
└── main/
├── java/com.artuur.todolist
│ ├── controller/ → Controladores HTTP (Endpoints)
│ ├── entity/ → Entidade Todo (modelo da tabela)
│ ├── repository/ → Interface JPA (CRUD no banco)
│ └── service/ → Lógica de negócio
└── resources/
└── application.properties
```

---

## 🗄️ Banco de Dados

### Para rodar com MySQL, configure no `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
```

---

## 🌐 Endpoints da API

| Método | Rota | Descrição |
|----------|--------|--------|
| GET | /todos | Retorna todas as tarefas
| POST | /todos | Cria uma nova tarefa
| PUT | /todos | Atualiza uma tarefa existente
| DELETE | /todos/{id} | Remove uma tarefa pelo ID

### Exemplo de JSON:

```
{
  "name": "Estudar Spring Boot",
  "description": "Teste",
  "priority": 3
}
```

**A API ficará disponível em:**

```
http://localhost:8080/todos
```

## 🗄️ Antes de rodar — Criar o Banco de Dados

Abra o **MySQL** e execute:

```sql
CREATE DATABASE todolist;
```
> O Spring Boot criará as tabelas automaticamente.

### Rodando a API

Para rodar a API, apenas clique no botão **Run** acima do metodo main na classe **TodolistApplication.java**

### Testando com Insomnia / Postman

POST http://localhost:8080/todos  
Body (JSON):
```json
{
  "name": "Treinar",
  "description": "Academia 19h",
  "priority": 2
}
```

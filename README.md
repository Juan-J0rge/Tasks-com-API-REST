# ✅ API de Tarefas com Spring Boot

Uma API REST simples feita com **Spring Boot**, que permite criar, listar e excluir tarefas.  
Testada com o **HTTPie**.

---

## 🚀 Funcionalidades da API

- `GET /tasks` → lista todas as tarefas
- `POST /tasks` → adiciona uma nova tarefa
- `DELETE /tasks` → remove todas as tarefas

---

## 🧪 Testando com HTTPie

> Você precisa ter o [HTTPie](https://httpie.io/) instalado e o servidor rodando (`localhost:8080`)

### 🔍 Listar tarefas
```bash
http GET localhost:8080/tasks
http POST localhost:8080/tasks --raw="nome da tarefa"
http DELETE localhost:8080/tasks

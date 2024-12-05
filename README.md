# ToDoList
Приложение Spring Boot, которое позволяет пользователям создавать, обновлять, удалять и просматривать задачи.
Этот проект демонстрирует основы Java, принципы ООП, RESTful API, Unit - тестирование, а так - же функции Spring Boot.

Основная цель этого приложения — позволить пользователям эффективно управлять своими повседневными задачами.

## Features
- Добавление новой задачи с описанием и статусом.
- Обновление сведений о задаче (например, отметка задачи как выполненной).
- Удаление задачи.
- Показать список всех задач с параметрами фильтрации (например, по статусу).
- Просмотреть информацию о задаче.

## Task example
``` json
{
  "id": 3,
  "description": "Task",
  "status": "In Progress"
}
```

## API Endpoints
| HTTP Method | Endpoint           | Description               |
|-------------|--------------------|---------------------------|
| GET         | `/api/tasks`        | Retrieve all tasks        |
| GET         | `/api/tasks/{id}`   | Retrieve task by ID       |
| POST        | `/api/tasks`        | Create a new task         |
| PUT         | `/api/tasks/{id}`   | Update task by ID         |
| DELETE      | `/api/tasks/{id}`   | Delete a task by ID       |


## Access: `http://localhost:8080/api/tasks`.
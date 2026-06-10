## Current Progress

### Completed

✅ Spring Boot Project Setup

✅ MySQL Integration

✅ Student Entity

✅ Address Entity

✅ Course Entity

✅ Student Repository

✅ Course Repository

✅ Student Service

✅ Course Service

✅ Student Controller

✅ Course Controller

✅ Create Student REST API

✅ Create Course REST API

✅ One-To-Many Relationship (Student → Address)

✅ Many-To-Many Relationship (Student ↔ Course)

✅ MySQL Schema Creation

✅ Tested via Postman

✅ Student Profile Update

✅ Course Assignment API

✅ Leave Course API

✅ Search Student By Name

✅ Search Students By Course

### Pending

🚧 Spring Security Authentication

🚧 Swagger/OpenAPI Documentation

🚧 DTO Layer

🚧 Global Exception Handling

🚧 Unit Testing

🚧 README Improvements

🚧 Postman Collection

## Database Relationships

### Student → Address

One Student can have multiple addresses:

- Permanent Address
- Current Address
- Correspondence Address

Relationship:

```java
@ManyToMany
```

### Student ↔ Course

A student can enroll in multiple courses and a course can have multiple students.

Relationship:

```java
@ManyToMany
```


## Available APIs

### Student APIs

POST /students

Create Student

---

### Course APIs

POST /courses

Create Course  

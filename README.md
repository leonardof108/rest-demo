# 🌩️ Cloud Vendor REST API (Spring Boot)

This is a simple RESTful web service built using Spring Boot, demonstrating clean architecture and best practices such as service separation, persistence with Spring Data JPA, and database using PostgreSQL. Designed as a base for deeper concepts like testing, security, CI/CD, Docker, and more.

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Security
- Spring Validation
- PostgreSQL
- Lombok
- Jakarta Validation
- JUnit & Mockito
- Maven
- Docker
- Docker compose
- Swagger

## 📦 Features

- ✅ CRUD operations for managing cloud vendors
- ✅ Input validation with Jakarta Validation
- ✅ Centralized exception handling
- ✅ Clean API responses with ResponseEntity
- ✅ Basic HTTP authentication
- ✅ RESTful endpoints
- ✅ PostgreSQL for persistence using Spring Data JPA
- ✅ Service layer separation
- ✅ Reduced boilerplate with **Project Lombok**
- ✅ **validation annotations** with Jakarta Validation (`@NotBlank`, `@Pattern`)
- ✅ Input sanitization
- ✅ Unit testing with JUnit & Mockito
- ✅ Dockerized the app with a production-style Dockerfile
- ✅ Created a multi-container setup via docker-compose.yml
- ✅ Set up PostgreSQL as a separate service
- ✅ Added healthcheck to ensure DB readiness
- ✅ Added Springdoc + Swagger UI for auto-generated API docs
- ✅ Added Actuator for potential monitoring endpoints
- ✅ Completely platform-independent


## 🚀 Endpoints

| Method | Endpoint               | Description                |
|--------|------------------------|----------------------------|
| GET    | `/cloudvendor`         | Get all cloud vendors      |
| GET    | `/cloudvendor/{id}`    | Get vendor by ID           |
| POST   | `/cloudvendor`         | Create a new vendor        |
| PUT    | `/cloudvendor`         | Update a vendor            |
| DELETE | `/cloudvendor/{id}`    | Delete vendor by ID        |

All endpoints require Basic Auth (admin / admin123 by default)

## ✅ Validation

- Vendor ID, name, address, and phone number must not be blank.
- Phone number must be 10 digits.
- Errors are returned in a standardized JSON format.

## 🔐 Authentication
- Enabled with Spring Security using HTTP Basic Auth.
- Update credentials in application.properties.

## 🧪 Testing
- Unit tests for service and controller layers.
- Used Mockito for mocking dependencies.
- Added spring-security-test for future integration tests.

## 🗄️ Database
- Using PostgreSQL.
- Ensure your local PostgreSQL instance has a database named clouddb.
- Update credentials in application.properties.

## 📦 Swagger/OpenAPI

I've added Swagger UI to auto-document and explore API endpoints. Springdoc is used for OpenAPI 3.0 integration.

## 🐳 Docker & Docker Compose

This project includes Docker support for containerized deployment.

### Running the App

1. Clone the repository
2. Build and start services:
```bash
docker-compose up --build
```
App will be accessible at: `http://localhost:8080`
Swagger API docs: `http://localhost:8080/swagger-ui/index.html`


Service	Description	Port
App	Spring Boot REST API	8080
Database	PostgreSQL (clouddb)	5432

| Service | Description               | Port                |
|--------|------------------------|----------------------------|
| App    | Spring Boot REST API         | 8080      |
| Database    | PostgreSQL (clouddb)    | 5432    |

## 📌 Future Enhancements

- CI/CD & Cloud deployment

---

### 🧪 Sample Endpoint

```http
POST /cloudvendor
{
  "vendorId": "cloud123",
  "vendorName": "AWS",
  "vendorAddress": "USA",
  "vendorPhoneNumber": "1234567890"
}
```

If any required fields are missing or malformed, validation errors are returned with helpful messages.



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

## 🛠 How to Run

1. Clone the repository  
2. Open in IntelliJ or your preferred IDE  
3. Run `RestDemoApplication.java`  
4. Access the API at `http://localhost:8080/cloudvendor`

## 📌 Future Enhancements

- Containerize the application (Docker)
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



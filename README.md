# 🌩️ Cloud Vendor REST API (Spring Boot)

This is a simple RESTful web service built using Spring Boot, demonstrating clean architecture and best practices such as service separation, persistence with Spring Data JPA, and in-memory database using H2. Designed as a base for deeper concepts like testing, security, CI/CD, Docker, and more.

## 🔧 Tech Stack

- Java 17
- Spring Boot (Web, Data JPA)
- H2 (In-memory Database)
- Maven

## 📦 Features

- CRUD operations for Cloud Vendors
- Persistence using Spring Data JPA
- Service layer separation
- In-memory H2 database
- RESTful endpoints

## 🚀 Endpoints

| Method | Endpoint               | Description                |
|--------|------------------------|----------------------------|
| GET    | `/cloudvendor`         | Get all cloud vendors      |
| GET    | `/cloudvendor/{id}`    | Get vendor by ID           |
| POST   | `/cloudvendor`         | Create a new vendor        |
| PUT    | `/cloudvendor`         | Update a vendor            |
| DELETE | `/cloudvendor/{id}`    | Delete vendor by ID        |

## 🛠 How to Run

1. Clone the repository  
2. Open in IntelliJ or your preferred IDE  
3. Run `RestDemoApplication.java`  
4. Access the API at `http://localhost:8080/cloudvendor`  
5. H2 Console: `http://localhost:8080/h2-console`  
   - JDBC URL: `jdbc:h2:mem:clouddb`  
   - User: `sa`, Password: *(leave blank)*

## 📌 Future Enhancements

- Bean validation for input data  
- Global exception handling  
- Spring Security  
- Unit & integration tests  
- Docker & containerization  
- CI/CD pipelines  
- Cloud deployment

---

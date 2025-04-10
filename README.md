# 🌩️ Cloud Vendor REST API (Spring Boot)

This is a simple RESTful web service built using Spring Boot, demonstrating clean architecture and best practices such as service separation, persistence with Spring Data JPA, and database using PostgreSQL. Designed as a base for deeper concepts like testing, security, CI/CD, Docker, and more.

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok
- Jakarta Validation
- Maven

## 📦 Features

- ✅ CRUD operations for managing cloud vendors
- ✅ RESTful endpoints
- ✅ Switched from in-memory H2 database to PostgreSQL for persistence using Spring Data JPA
- ✅ Service layer separation
- ✅ Reduced boilerplate with **Project Lombok**
- ✅ Added **validation annotations** with Jakarta Validation (`@NotBlank`, `@Pattern`)
- ✅ Implemented exception handling for invalid inputs (currently handled in-controller)


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

## 📌 Future Enhancements

- Centralize exception handling using `@RestControllerAdvice`
- Improve API response formats with `ResponseEntity`
- Add unit and integration testing
- Implement security with Spring Security
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



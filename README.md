# ☁️ Spring Boot Cloud Vendor API

A simple RESTful API built with **Spring Boot** that manages cloud vendor data.

## 🚀 Features

- Create, update, retrieve, and delete cloud vendor details
- Follows REST architecture
- Built using Java 17 and Spring Boot
- Clean and minimal codebase (great for beginners!)

## 🛆 Tech Stack

- Java 17
- Spring Boot
- Maven
- REST API

## 🔧 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/spring-boot-cloud-vendor-api.git
cd spring-boot-cloud-vendor-api
```

### 2. Run the application

You can run it using IntelliJ or from the terminal:

```bash
./mvnw spring-boot:run
```

> Make sure you have JDK 17 and Maven installed.

## 🧲 API Endpoints

| Method | Endpoint              | Description                  |
|--------|-----------------------|------------------------------|
| GET    | `/cloudvendors/{id}`   | Get vendor details           |
| POST   | `/cloudvendors`        | Create a new vendor          |
| PUT    | `/cloudvendors`        | Update an existing vendor    |
| DELETE | `/cloudvendors/{id}`   | Delete a vendor              |

### Example JSON for POST/PUT

```json
{
  "vendorId": "AWS123",
  "vendorName": "Amazon Web Services",
  "vendorAddress": "Seattle, WA",
  "vendorPhoneNumber": "1800-123-456"
}
```

## 📈 Roadmap

- Add persistence layer using Spring Data JPA + H2/PostgreSQL
- Add validation and exception handling
- Swagger/OpenAPI docs
- Docker support

## 📸 Diagrams

_You can add a simple architecture diagram here (see below)_

## 🤝 Contributing

Open to suggestions, issues, and improvements!

## 📢 Contact

Created by [@leonardof108](https://github.com/leonardof108)


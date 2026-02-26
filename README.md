Customer Service is a Spring Boot microservice responsible for managing customers.
It provides REST APIs for creating, updating, retrieving, and deleting customers.

## Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 (for development)
- Maven
- Docker


API Endpoints

GET    /customers 

GET    /customers/{id}

POST   /customers

PUT    /customers/{id}

DELETE /customers/{id}

## Architecture
- controller → REST layer
- service → business logic
- repository → data access
- dto → API layer models
- entity → persistence layer

## Database
H2 in-memory database is used for development.
H2 console available at:
http://localhost:8080/h2-console

## How to Run

```bash
mvn clean install
mvn spring-boot:run

# User Registration and Fetch API

This is a Spring Boot application that provides RESTful endpoints for user registration and fetching user details. The application uses MySQL as the datastore.

## Requirements

- Java 11 or higher
- Maven
- MySQL

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/abhisek247767/Makersharks-Sign-Up-Fetch.git
cd yourrepository
```

### 2. Setup MySQL Database
Start your MySQL server.
Create a database named demo

```bash
CREATE DATABASE demo;
```
### 3. Update MySQL Credentials
Update the MySQL credentials in the src/main/resources/application.properties file.
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/demo
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```
Replace yourpassword with your MySQL root password.

### 4. Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```

The application will start running at http://localhost:8080.

## API Endpoints

### 1. Register User
Endpoint: /api/user/register
Method: POST
Description: Register a new user.

```bash
curl -X POST -H "Content-Type: application/json" -d '{"username": "john", "email": "john@example.com", "password": "password123"}' http://localhost:8080/api/user/register
```
### 2. Fetch User
Endpoint: /api/user/fetch
Method: GET
Description: Fetch user details by username.
```bash
curl -X GET "http://localhost:8080/api/user/fetch?username=john"
```

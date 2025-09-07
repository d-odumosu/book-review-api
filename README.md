# 📚 Book Review API

A Spring Boot REST API for managing **books**, **users**, and **reviews**.  

---

## 🚀 Features
- CRUD operations for **Books**, **Users**, and **Reviews**  
- Validation on fields (e.g., email format, rating range)  
- Relationships:
  - One `User` can write many `Reviews`  
  - One `Book` can have many `Reviews`  
- Sample data provided in `data.sql` (20 rows each for Users, Books, Reviews)  
- Some users and books are left **without reviews** to test empty responses  

---

## 🛠️ Prerequisites
Before running the project, make sure you have:

- **Java 17+**  
- **Maven 3.8+**  
- **MySQL 8+**

---

## ⚙️ Setup & Run

### 1️⃣ Configure Database
Create a database in MySQL:

```sql
CREATE DATABASE bookreviewdb;
Update your application.properties with your local MySQL credentials:

- spring.datasource.url=jdbc:mysql://localhost:3306/bookreviewdb
- spring.datasource.username=root
- spring.datasource.password=your_password
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true
- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

2️⃣ Seed Data
The data.sql is in src/main/resources/.
Spring Boot will automatically run them to create tables and insert sample data.

3️⃣ Run the Application

./mvnw spring-boot:run

Or build and run:

./mvnw clean package

📌 API Endpoints

Once the application is running, you can explore the API documentation using Swagger UI. Open your browser and go to:

http://localhost:8080/swagger-ui.html  
 

This provides an interactive interface where you can test endpoints (GET, POST, PUT, DELETE) directly.



🧪 Testing the API
Once the app is running:

Use Postman to test endpoints.

Example request:


GET http://localhost:8080/books

Some users and books are deliberately left without reviews to test empty responses.

📂 Project Structure

The project is organized by feature, each feature (Book, User, Review) contains its own controller, service and repository. The structure is as follows:

com.me.bookreviewapi
 ├── book/
 │   ├── Book.java
 │   ├── BookRepository.java
 │   ├── BookService.java
 │   ├── BookController.java
 │   ├── BookNotFoundException.java
 │   └── BookValidationException.java
 │
 ├── exception/
 │   └── GlobalExceptionHandler.java   
 │
 ├── model_interface/
 │   └── BaseEntity.java
 │
 ├── review/
 │   ├── Review.java
 │   ├── ReviewRepository.java
 │   ├── ReviewService.java
 │   ├── ReviewController.java
 │   ├── ReviewNotFoundException.java
 │   └── InvalidReviewContentException.java
 │
 ├── user/
 │   ├── User.java
 │   ├── Role.java
 │   ├── UserRepository.java
 │   ├── UserService.java
 │   ├── UserController.java
 │   └── UserNotFoundException.java
 │
 ├── resources/
 │   ├── application.properties  # Database configuration
 │   └── data.sql                # Sample data inserted at startup
 │
 ├── test/
 │   └── repository/
 │       ├── BookRepositoryTest.java
 │       ├── ReviewRepositoryTest.java
 │       └── UserRepositoryTest.java
 │
 └── BookReviewApiApplication.java


             

 


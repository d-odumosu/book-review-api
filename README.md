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

Use Postman, Insomnia, or curl to test endpoints.

Example request:


GET http://localhost:8080/books

Some users and books are deliberately left without reviews to test empty responses.

📂 Project Structure

The project is organized by feature rather than by strict layers. Each feature (Book, User, Review) contains its own controller, service, repository, and entity classes. This keeps related code together and makes the project easier to extend. The structure is as follows:

src/main/java/com/me/bookreviewapi
 ├── book/         # Book entity, repository, service, controller
 ├── review/       # Review entity, repository, service, controller
 ├── user/         # User entity, repository, service, controller
 

src/main/resources
 ├── application.properties   # Database configuration
 ├── data.sql                 # Sample data inserted at startup

 


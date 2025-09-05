# Book Review API
explain where data.sql will be

## How to run
1. Start MySQL in Docker:
   docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=mydb -p 3306:3306 -v mysql_data:/var/lib/mysql -d mysql:8

2. Start the Spring Boot app:
   ./mvnw spring-boot:run

3. Test the API:
   - GET http://localhost:8080/books
   - GET http://localhost:8080/reviews
   - POST http://localhost:8080/books
     { "title": "Half of a Yellow Sun", "author": "Chimamanda Ngozi Adichie", "publishedYear": 2006 }

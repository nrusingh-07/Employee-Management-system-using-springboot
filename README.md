Employee Management System (Spring Boot)

A simple and robust Employee Management System built using Spring Boot, Spring Data JPA, and MySQL.
This project provides RESTful APIs to perform basic CRUD operations on employee records and is ideal for beginners learning Spring Boot + JPA.

 Features:
 
Add new employees
Fetch all employees
Fetch employee by ID
Update employee details
Delete employee records
RESTful API design
MySQL database integration
Hibernate ORM with JPA

🛠️ Tech Stack:

Java (17+)
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven
Postman (for API testing)

📂 Project Structure
employeeManagement
│
├── controller
│   └── EmployeeController.java
│
├── service
│   └── EmployeeService.java
│
├── repository
│   └── EmployeeRepo.java
│
├── entity
│   └── Employee.java
│
├── EmployeeManagementApplication.java
└── application.properties

🧩 Entity Details:

Employee
id (Primary Key)
name
salary
gender

⚙️ Configuration (application.properties):

spring.application.name=employeeManagement
server.port=9090
spring.datasource.url=jdbc:mysql://localhost:3306/emp
spring.datasource.username=root
spring.datasource.password=*********
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

📡 REST API Endpoints
➤ Get all employees
GET /empapi/employee
➤ Get employee by ID
GET /empapi/employee/{id}
➤ Add new employee
POST /empapi/employee

Request Body (JSON):

{
  "name": "Rahul",
  "salary": 35000,
  "gender": "male"
}
➤ Update employee
PUT /empapi/employee
➤ Delete employee
DELETE /empapi/employee/{id}
🧪 Testing the APIs

Use Postman to test all endpoints

Ensure MySQL server is running

Database name: emp

Table used by Hibernate: employee

🧠 Key Learnings:

Constructor-based dependency injection
RESTful API development using Spring Boot
Entity–Table mapping using JPA
Hibernate automatic table creation
CRUD operations with MySQL
Debugging common Spring Boot issues (table mismatch, empty response, etc.)

⚠️ Common Issues Faced & Fixes:

Empty response in Postman → Missing GET mapping for /employee/{id}
Data mismatch → Entity table name mismatch in MySQL
Multiple tables created → Hibernate default table naming behavior

📌 Future Enhancements:

Add validation using @Valid
Use ResponseEntity for better HTTP responses
Add global exception handling
Integrate Swagger/OpenAPI
Add authentication & authorization

 Author
Nrusingh

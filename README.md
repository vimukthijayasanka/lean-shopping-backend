# 🛍️ Lean Clothing

**Lean Clothing** is a Spring Boot-based e-commerce web application designed for the LEAN clothing brand. It supports functionalities like product management, customer interactions, and order processing with a robust Java backend and MySQL database integration.

## Features

- Spring Boot 3.4.5
- Java 21 support
- RESTful API with Spring Web
- Data validation with Spring Validation
- Data persistence with Spring Data JPA
- MySQL database integration
- Lombok for reducing boilerplate code
- Unit testing support with Spring Boot Test

## Tech Stack

- **Backend**: Spring Boot, Java 21
- **Database**: MySQL
- **Build Tool**: Maven
- **Testing**: JUnit with Spring Boot Starter Test

## Prerequisites

- Java 21
- Maven 3.8+
- MySQL Server

## Getting Started

1. Clone the repository:
``` bash
   git clone https://github.com/your-username/lean-clothing.git
   cd lean-clothing
   
````

2. Configure your MySQL connection in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/lean_clothing_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

## License

This project is licensed under the [MIT License](license.txt).

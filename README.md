# Spring Boot E-Commerce Application

This project is a robust backend application for an e-commerce platform, developed using **Spring Boot**. The
application offers complete CRUD operations for managing products, product categories, and associated product images,
ensuring scalability, modularity, and secure user authentication.

## Features

### 1. **Product Management**

- CRUD operations: Add, delete, update, and retrieve products.
- Seamless integration of product categories and product images using well-defined database relationships.
- Efficient handling of large product datasets.

### 2. **Authentication and Security**

- Implemented **Spring Security** with **JWT (JSON Web Token)** authentication.
- Secure login functionality for users, ensuring data privacy and preventing unauthorized access.
- Role-based access control can be easily extended for admins, sellers, and customers.

### 3. **RESTful API Design**

- APIs designed following best practices for modularity and maintainability.
- Easy-to-understand endpoints with clear documentation.

### 4. **Database Integration**

- Used **MySQL** as the primary database for backend storage.
- Leveraged **JPA/Hibernate** for Object-Relational Mapping (ORM), providing seamless interaction with the database.
- Efficient query performance and proper handling of relationships (e.g., One-to-Many, Many-to-One).

### 5. **Scalable and Maintainable Architecture**

- Clean code structure with modularized packages for controllers, services, repositories, and models.
- Designed to easily scale and accommodate additional features in the future.

---

## Tech Stack

- **Spring Boot**: Backend framework.
- **Spring Security**: Authentication and authorization.
- **JWT**: Token-based authentication.
- **MySQL**: Database management.
- **JPA/Hibernate**: ORM for database operations.
- **Maven**: Dependency management.

---

## How to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Configure MySQL**:
    - Update the `application.properties` file with your MySQL database credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
      spring.datasource.username=<your-username>
      spring.datasource.password=<your-password>
      ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **API Endpoints**:
    - Access the APIs via tools like Postman or any frontend application.

---

Feel free to explore the project, suggest improvements, or contribute by submitting a pull request. Your feedback is
highly appreciated! 😊

--- 



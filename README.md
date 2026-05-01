# Security Application

A Spring Boot security application built with Java 25, providing user authentication and authorization features.

## Project Overview

This project is a Spring Boot-based security application that implements:
- User authentication using Spring Security
- Custom UserDetailsService for database-backed authentication
- RESTful API endpoints for user management
- MySQL database integration with JPA/Hibernate

## Technology Stack

- **Java**: 25
- **Spring Boot**: 4.0.6
- **Spring Security**: For authentication and authorization
- **Spring Data JPA**: For database operations
- **MySQL**: Database (version 8.0.33)
- **Maven**: Build tool

## Project Structure

```
src/
├── main/java/br/com/projeto/
│   ├── Application.java              # Main application entry point
│   ├── controller/
│   │   └── UserController.java       # REST API endpoints for users
│   ├── entity/
│   │   └── Usuario.java              # User entity model
│   ├── repository/
│   │   └── UsuarioRepository.java    # Data access layer
│   ├── service/
│   │   └── CustomUserDetailsService.java  # Custom authentication service
│   └── security/
│       ├── CustomUserDetails.java    # Custom user details implementation
│       └── SecurityConfig.java       # Security configuration
└── test/java/br/com/projeto/security/
    └── SecurityApplicationTests.java # Unit tests
```

## Prerequisites

- JDK 25 or higher
- Maven 3.6+
- MySQL 8.0+

## Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd security
```

### 2. Configure Database

Create a MySQL database and update the connection properties in `src/main/resources/application.properties` (or `application.yml`):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build the Project

```bash
./mvnw clean install
```

Or on Windows:

```cmd
mvnw.cmd clean install
```

### 4. Run the Application

```bash
./mvnw spring-boot:run
```

The application will start at `http://localhost:8080`

## API Endpoints

The application exposes REST endpoints through the `UserController`. Refer to the controller class for available endpoints.

## Security Configuration

The security settings are configured in `SecurityConfig.java`, including:
- Authentication mechanisms
- Password encoding
- Request authorization rules

## Testing

Run all tests with:

```bash
./mvnw test
```

## Development

### Code Style

Ensure code follows the project's coding standards before committing.

### Making Changes

1. Create a feature branch
2. Make your changes
3. Write/update tests
4. Submit a pull request

## License

This project is proprietary software. All rights reserved.

## Contact

For questions or support, please contact the development team.

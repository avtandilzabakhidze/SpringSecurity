# Spring Security Project

This project demonstrates the implementation of Spring Security for securing a RESTful API with role-based access control (RBAC). It includes features such as authentication, authorization and password encryption.

## Project Structure

The project is structured as follows:

- **`com.example.springsecurity.domain`**: Contains the domain model classes.
- **`com.example.springsecurity.controller`**: Includes the REST controller classes for handling HTTP requests.
- **`com.example.springsecurity.security`**: Contains the security configuration classes and enums for defining permissions and roles.
  
### Domain
- **`Student`**: Represents a student entity with `id` and `name` fields.

### Controllers
- **`StudentController`**: Manages endpoints related to student data retrieval.
- **`StudentManagementController`**: Handles endpoints for CRUD operations on student data.

### Security
- **`ApplicationSecurityConfig`**: Configures security settings such as authentication, authorization, and password encoding.
- **`ApplicationUserPermission`**: Enum defining different permissions.
- **`ApplicationUserRole`**: Enum defining different user roles.
- **`PasswordConfig`**: Configures password encoding using BCryptPasswordEncoder.

## Features

- **Authentication**: Users can authenticate themselves using basic authentication.
- **Authorization**: Access to endpoints is restricted based on user roles and permissions.
- **Password Encryption**: Passwords are encrypted using BCryptPasswordEncoder for enhanced security.
- **Role-Based Access Control (RBAC)**: Different users have different roles and permissions to access various parts of the application.

## Usage

The project provides REST endpoints for managing student data. Users with different roles have different access levels to these endpoints. 

## Security Configuration

The security configuration (`ApplicationSecurityConfig`) defines URL patterns and their corresponding access permissions. It also configures authentication using in-memory user details.

## Dependencies

- **Spring Boot**: Provides the framework for building the application.
- **Spring Security**: Offers authentication and authorization features.
- **Lombok**: Simplifies Java code by generating boilerplate code.


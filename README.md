# Java E-commerce Application

Spring Web - Spring Data JPA - MySQL Driver - Spring Security - Lombok - Spring Boot Devtools 

This guide provides instructions to set up and run the Java E-commerce Application, including both the backend and frontend components.

## Database Setup (MySQL) 

To start MySQL, use the following command:  
`brew services start mysql`

To check if MySQL is running:  
`brew services list`

To stop MySQL:  
`brew services stop mysql`

## Backend Setup

### Prerequisites
Ensure you have Maven and Java installed on your system.

### Build and Run the Backend
1. Clean and build the project, skipping tests:  
   `mvn clean install`
   
2. Start the Spring Boot backend:  
   `mvn spring-boot:run`

## Frontend Setup

### Prerequisites
Ensure you have Node.js and npm installed on your system.

### Create and Configure the Frontend
1. Create a new React application:  
   `npx create-react-app ecommerce-frontend`
   
2. Install required dependencies:  
   `npm install react-router-dom tailwindcss @headlessui/react axios @mui/material @emotion/react @emotion/styled`
   
3. Start the React application:  
   `npm start`

## Summary

1. Start MySQL using the provided commands.  
2. Build and run the backend using Maven.  
3. Set up and run the frontend using React.

With this guide, you'll have a fully functional e-commerce application, powered by a Spring Boot backend and a React frontend.


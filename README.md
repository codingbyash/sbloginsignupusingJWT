
# Spring Boot & React JWT Authentication

This project demonstrates how to set up a full-stack application with Spring Boot for the backend and React for the frontend. It includes features for user sign-up, login, and JWT-based authentication.

## Table of Contents
- [Technologies](#technologies)
- [Project Setup](#project-setup)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Contributing](#contributing)

## Technologies
- **Backend**: Spring Boot, Spring Security, JWT
- **Frontend**: React, Axios
- **Authentication**: JWT (JSON Web Token)
- **Database**: H2 Database (can be replaced with other databases)

## Project Setup

### Backend Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/springboot-react-jwt-authentication.git
   cd springboot-react-jwt-authentication
   ```

2. **Install dependencies:**

   Ensure that you have [Maven](https://maven.apache.org/) and [JDK 11](https://openjdk.java.net/projects/jdk/11/) or higher installed.

   Then, run the following command to install all the backend dependencies:

   ```bash
   mvn clean install
   ```

3. **Configure application properties:**

   Open `src/main/resources/application.properties` and configure your database and other settings.

   Example configuration:

   ```properties
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   spring.h2.console.enabled=true
   ```

4. **Run the Spring Boot application:**

   Start the backend server using the following command:

   ```bash
   mvn spring-boot:run
   ```

   The backend should now be running on [http://localhost:8080](http://localhost:8080).

### Frontend Setup

1. **Clone the repository:**

   If you haven't already cloned the repository, clone it using the following command:

   ```bash
   git clone https://github.com/codingbyash/sbloginsignupusingJWT
   cd frontend
   cd loginsignup
   ```

2. **Install frontend dependencies:**

   Make sure you have [Node.js](https://nodejs.org/) and [npm](https://www.npmjs.com/) installed. Then, run the following command to install all the frontend dependencies:

   ```bash
   npm install
   ```

3. **Start the React application:**

   Run the following command to start the frontend server:

   ```bash
   npm run dev
   ```

   The React app will be available at [http://localhost:3000](http://localhost:3000).

## Running the Application

Once both the frontend and backend are running, the application should be fully functional. You can use the sign-up and login forms in the frontend to interact with the backend.

### Example Workflow

1. **Sign Up:**

   - Go to the sign-up page (`/signup`) and register a new user.
   - The backend will store user details in the database and respond with a success message.

2. **Login:**

   - Go to the login page (`/login`).
   - Provide the registered username and password to receive a JWT token in response.

3. **Access Protected Resources:**

   - The JWT token returned after login will be used for authentication.
   - Pass the token in the `Authorization` header for requests to protected resources.

## Endpoints

### Auth API
- **POST /api/auth/signup** – Create a new user (sign-up)
- **POST /api/auth/login** – Authenticate a user and return a JWT token
- **GET /api/protected** – Protected route (requires JWT token)

### Security Configuration

The backend uses JWT tokens for securing routes. You will need to include the token in the `Authorization` header for all protected routes like this:

```bash
Authorization: Bearer <your_jwt_token>
```

## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request with your changes.

1. Fork the repository
2. Create a new branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -am 'Add feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Submit a pull request

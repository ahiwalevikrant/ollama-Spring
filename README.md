# Ollama-Springboot

## Overview
Ollama Spribgboot is a simple Spring Boot application that provides an API to handle queries. This project demonstrates a basic implementation of a RESTful web service.

## Features
- Exposes a single API endpoint to accept and process queries.
- Built using Spring Boot for easy development and deployment.

## Prerequisites
- Java 21
- Maven 
- Spring Boot dependencies

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/ollama-deepakc.git
   cd ollama-deepakc
   ```

2. Build the project:
   ```sh
   mvn clean install
   ```

## Usage
### Running the Application
To start the Spring Boot application, run:
```sh
mvn spring-boot:run
```
or
```sh
java -jar target/ollama-deepakc.jar
```

### API Endpoint
- **Query API**
    - Endpoint: `GET /api/query?question={your-query}`
    - Example Request:
      ```sh
      curl -X GET "http://localhost:8080/api/query?question=What is Spring Boot?"
      ```
    - Example Response:
      ```json
      {
        "question": "What is Spring Boot?",
        "answer": "Spring Boot is an open-source Java-based framework used to create stand-alone, production-grade Spring applications."
      }
      ```

## Author
Vikrant Ahiwale


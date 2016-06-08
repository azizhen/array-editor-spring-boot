## Synopsis

Springboot REST API with Automated API Documentation Generation using Swagger.

The purpose of this project is to demonstrate the usage of Springboot to expose a Spring MVC REST API
and generate API Documentation using Swagger.

It makes use of common Array Editing Utilities as the logic for the API.

The REST api can be used as a standalone application via the Swagger UI or as part of a larger system via its REST API.

## Installation

**Prerequisites:**
* Maven 
* JDK 1.8
* Internet Connection to retrieve Maven Dependencies
* Git to clone the source files
* Port 8080 on your machine should be unused in order to run the embedded Tomcat

Instructions:

1. Clone the project using Git as per following command
```git clone https://github.com/azizhen/array-editor-spring-boot.git```

2. Run the Maven command in the root of the directory that you cloned the project into. This is to build the project and download its dependencies
```mvn clean install```

3. Run the Maven command for Spring Boot. This will start up a Tomcat container on port 8080 and expose the REST API and Swagger UI
``` mvn spring-boot:run ```

4. Confirm installation is correct by visiting the following url
http://localhost:8080/swagger-ui.html

## API Reference

The API can be seen here once deployed and the REST API can be executed from this UI:

http://localhost:8080/swagger-ui.html

Instructions on how to use the API and sample JSON input can be found in Swagger UI.
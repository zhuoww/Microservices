# Microservices

## Initializing a REST API project with Spring Boot

### Setup REST API project

![Spring Initializr](https://github.com/zhuoww/Microservices/blob/main/img/spring%20initializr.png?raw=true)

- genetate
- extract that ZIP file to a folder on your local machine

### Import Project using Eclipse

- Import projects in Project Explorer
- Select an import wizard
  - Existing Maven Project
- Root Directory
  - Browse, find the project folder your saved on your local machine
    ![Original Files](https://github.com/zhuoww/Microservices/blob/main/img/original%20files.png?raw=true)
    - **Maven Structure Project**
      - src/main/java: has the source code
      - src/main/resources: has all your configuration
      - src/test/java: where you'd try your unit tests
      - pom.xml: where you define your dependencies

### Create Project

![create project](https://github.com/zhuoww/Microservices/blob/main/img/Create%20Project.png?raw=true)

- RestfulWebServicesApplication.java: use to launch up the Spring Boot application

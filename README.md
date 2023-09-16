                                            Person Management System
The Person Management System is a Java-based Restful web service that provides functionalities for managing individual records with their personal information and addresses.

                                                Table of Contents
Description

Technologies Used

Project Structure

API Endpoints

Getting Started

Contributing

                                                  Description
The Person Management System is designed to handle basic CRUD (Create, Read, Update, Delete) operations for individuals (persons). It allows you to: Create: Add new person records with details such as Email, FirstName, LastName, PhoneNumber, Address and Sex. Retrieve: Fetches person records by their Email, Name or PhoneNumber. Update: Modify existing Person records. Delete: Remove person records from the system. The system ensures data integrity and provides error handling for various scenarios making it a reliable solution for managing personal information.

                                                    Technologies Used
The project is built using the following technologies and frameworks: Java: The core programming language. Spring Boot: A popular framework for building Java applications. Spring Starter Data Mongodb: Simplifies database access using Java Persistence API. Spring Boot Validation: Provides validation for inputs. Lombok: Reduces boilerplate code by generating common methods. Maven: A build tool for managing dependencies and building the project.

                                                    Project Structure
The project is built and organized into several packages using one of the most common architectural build, Layered Architecture: com/example/demo/controllers: Contains the REST API controllers. com/example/demo/data/models: Defines the data models for Person and Address. com/example/demo/exceptions: throws and handle all possible exception(s) that might occur while using the program com/example/demo/services: Contains the business logic and service implementations. resources: Contains configuration files, including application.properties. pom.xml: Maven project configuration.

                                                    API Endpoints
The REST API exposes the following endpoints: POST /api: Create a new person record. GET /api/{user_id}: Retrieve a person by their email. GET /api/name/{user_id}: Retrieve a list of persons by their name. GET /api/phone/{user_id}: Retrieve a person by their phone number. PUT /api/{user_id}: Update an existing person record. DELETE /api/{user_id}: Delete a person by their email registered. N.B: Each endpoint serves a specific purpose in managing person data within the system.

                                                    Getting Started
To run this project locally, follow these steps listed below:

Clone the repository to your local machine.
Ensure you have Java 17, you may also decide to upgrade the project version too.
Build and run the project using Maven:
mvc architecture software design pattern used in building applications spring-boot:run
The API will be accessible at http://localhost:{port_number}

                                                       Contributing
If you'd like to contribute to this project, please follow these guidelines:

Fork the repository.
Create a new branch for your feature.
Make your changes and test thoroughly.
Create a pull request with a clear description of your changes.
Be open to feedback and code reviews. Thank you!# Hng_project
# Hng_project

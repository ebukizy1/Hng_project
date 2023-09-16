{
	"info": {
		"_postman_id": "166c2b08-5a72-47d5-8b9e-2780e0995af1",
		"name": "PERSON CRUD API",
		"schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json",
		"_exporter_id": "28477024"
	},
	"item": [
		{
			"name": "http://localhost:9002/api",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"firstName\" : \"segun\",\n    \"lastName\" : \"retnar\",\n    \"emailAddress\" : \"ebukizy01@gmail.com\",\n    \"gender\" : \"MALE\",\n    \"address\":{\n        \"country\" : \"AMERICA\",\n        \"state\" : \"NEW YORK\",\n        \"city\" : \"New JERSEY\",\n        \"streetAddress\" : \"No 7 tarjudeen street\" \n    }\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:9002/api",
				"description": "POST Create Person  \nEndpoint: [http://localhost:9002/api](http://localhost:9002/api)  \n\"This POST request is used to create a new person with detailed information, including their firstName, lastName, email, gender, and address. so the email address i made it unique because in general terms, email is private to an individual so with that i made it private so it will be my primary key. The gender is implemented as an enum class to ensure it remains constant, with options limited to 'Male' and 'Female.' The address is represented as a separate class due to its unique attributes. A composition relationship is established between the person and the address, allowing each person to have their own address.\"  \nRequest:  \nMethod: POST  \nURL: [http://localhost:9002/api](http://localhost:9002/api)  \nthis is the requestBody which is sent as json format  \nRequestBody : {  \n\"firstName\": \"segun\",  \n\"lastName\": \"retner\",  \n\"emailAddress\": \"[ebukizy01@gmail.com](https://mailto:ebukizy01@gmail.com)\",  \n\"gender\": \"MALE\",  \n\"address\": {  \n\"country\": \"AMERICA\",  \n\"state\": \"NEW YORK\",  \n\"city\": \"New JERSEY\",  \n\"streetAddress\": \"No 7 Tarjudeen Street\"  \n}  \n}  \nResponse:  \nSuccess Response (201 Created):  \nBody:{\n\n```\n\"id\": \"6504195ed7e8ad24c63bff46\",\n\"firstName\": \"segun\",\n\"lastName\": \"retnar\",\n\"emailAddress\": \"ebukizy01@gmail.com\",\n\"message\": \"successfully created person!!...\"\n\n ```\n\n}  \nDescription: When a person is successfully created, the API responds with a 201 Created status code. The response body includes essential information about the newly created person, including their unique identifier (id), firstName, lastName, emailAddress, and a success message (message) indicating the successful creation of the person.  \n  \n  \n**BAD REQUEST:**\n\nThis section tests various bad request scenarios and the responses from the global exception controller.\n\n1. **Empty and Null Values for 'firstName' 'lastName'** {\n    \n    - \"firstName\": \"\",\n        \n    - \"lastName\": \"\",\n        \n    - \"emailAddress\": \"ebukizy01@gmail.com\",\n        \n    - \"gender\": \"MALE\",\n        \n    - \"address\": { \"country\": \"AMERICA\",\n        \n    - \"state\": \"NEW YORK\",\n        \n    - \"city\": \"New JERSEY\",\n        \n    - \"streetAddress\": \"No 7 Tarjudeen Street\"\n        \n    - }\n        \n    - }\n        \n    \n    - { \"firstName\": null,\n        \n    - \"lastName\": \"null\",\n        \n    - \"emailAddress\": \"ebukizy01@gmail.com\",\n        \n    - \"gender\": \"MALE\",\n        \n    - \"address\": { \"country\": \"AMERICA\",\n        \n    - \"state\": \"NEW YORK\",\n        \n    - \"city\": \"New JERSEY\",\n        \n    - \"streetAddress\": \"No 7 Tarjudeen Street\"\n        \n    - }\n        \n    - }\n        \n    - **Description:** These scenarios test cases where the 'firstName', 'lastName' field is either empty or null. The API responds with a `400 Bad Request` status code and an error message indicating that the 'firstName' field must not be empty or null.\n        \n2. **Empty and Null Values for 'country' in Address:**\n    \n    - { \"firstName\": \"segun\",  \n        \"lastName\": \"retnar\",  \n        \"emailAddress\": \"ebukizy01@gmail.com\",  \n        \"gender\": \"MALE\",  \n        \"address\": { \"country\": \"\",  \n        \"state\": \"NEW YORK\",  \n        \"city\": \"New JERSEY\",  \n        \"streetAddress\": \"No 7 Tarjudeen Street\"  \n        }  \n        }  \n        {  \n        \"firstName\": \"segun\",  \n        \"lastName\": \"retnar\",  \n        \"emailAddress\": \"ebukizy01@gmail.com\",  \n        \"gender\": \"MALE\",  \n        \"address\": { \"country\": null,  \n        \"state\": \"NEW YORK\",  \n        \"city\": \"New JERSEY\",  \n        \"streetAddress\": \"No 7 Tarjudeen Street\"  \n        } }\n        \n    - **Description:** These scenarios test cases where the 'country' field within the 'address' is either empty or null. The API responds with a `400 Bad Request` status code and an error message indicating that the 'country' field must not be empty or null.\n        \n\n**Error Response (400 Bad Request):**\n\nBody:\n\n``` json\n{\n    \"errorCode\": 400,\n    \"errorMessage\": \"Invalid input field. Please provide a valid input.\",\n    \"timestamp\": \"2023-09-15T09:29:18.543+00:00\"\n}\n\n ```"
			},
			"response": []
		},
		{
			"name": "http://localhost:9002/api/ebukizy123@gmail.com",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:9002/api/ebukizy123@gmail.com",
				"description": "**API Implementation Details:**\n\nThis API is implemented using Java with the Spring Boot framework.\n\n**GET Person by Email:**\n\nEndpoint: [http://localhost:9002/api/{email}](http://localhost:9002/api/{email})\n\nDescription: This GET request is used to retrieve a person's information based on their unique email address.\n\n**Request:**\n\nMethod: GET  \nURL: [http://localhost:9002/api/ebukizy123@gmail.com](http://localhost:9002/api/ebukizy123@gmail.com)  \nThis URL includes the email address used to identify the person.\n\n**Response:**\n\nSuccess Response (200 OK):\n\nbody : {  \n\"id\": \"65033c6af7fb7769d3043884\",  \n\"firstName\": \"boneshaker\",  \n\"lastName\": \"retnar\",  \n\"emailAddress\": \"[ebukizy123@gmail.com](https://mailto:ebukizy123@gmail.com)\",  \n\"gender\": \"MALE\",  \n\"address\": {  \n\"addressId\": null,  \n\"country\": \"Nigeria\",  \n\"state\": \"Lagos\",  \n\"city\": \"Ikeja\",  \n\"streetAddress\": \"No 7 Tarjudeen Street\"  \n}  \n}\n\nDescription: This endpoint allows you to retrieve a person's information by providing their unique email address in the URL. If a person with the specified email address is found, the API responds with a 200 OK status code and returns the person's details, including their unique identifier (id), firstName, lastName, emailAddress, gender, and address.\n\nThis documentation provides clear guidance on how to use the GET request to retrieve a person by email address and explains the expected response when a person is found based on the provided email address.\n\n**BAD REQUEST:**\n\nThis section tests a bad request scenario when an invalid email address is provided, and the response from the global exception controller is triggered.\n\n**GET Person by Email (Bad Request):**\n\nEndpoint: [http://localhost:9002/api/{email}](http://localhost:9002/api/{email})\n\nDescription: This GET request is used to retrieve a person's information based on their unique email address. In this scenario, an invalid email address is provided.\n\n**Request:**\n\nMethod: GET  \nURL: [http://localhost:9002/api/ebukizy123](http://localhost:9002/api/ebukizy123)  \nThis URL includes an invalid email address.\n\n**Error Response (400 Bad Request):**\n\nBody:\n\n``` json\n{\n    \"errorCode\": 400,\n    \"errorMessage\": \"ebukizy123 does not exist\",\n    \"timestamp\": \"2023-09-15T11:50:51.409+00:00\"\n}\n\n ```"
			},
			"response": []
		},
		{
			"name": "http://localhost:9002/api/ebukizy123@gmail.com",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": "http://localhost:9002/api/ebukizy123@gmail.com",
				"description": "**API Implementation Details:**\n\nThis API is implemented using Java with the Spring Boot framework.\n\n**DELETE Person by Email:**\n\nEndpoint: [http://localhost:9002/api/{email}](http://localhost:9002/api/{email})\n\nDescription: This DELETE request is used to delete a person based on their unique email address. Upon successful deletion, a confirmation message is returned as a string.\n\n**Request:**\n\nMethod: DELETE  \nURL: [http://localhost:9002/api/ebukizy01@gmail.com](http://localhost:9002/api/ebukizy01@gmail.com)  \nThis URL includes the email address used to identify the person for deletion.\n\n**Response:**\n\nSuccess Response (200 OK):\n\nBody:\n\n**Description:**\n\n- **Success Response (200 OK):**\n    \n    - \"ebukizy01@gmail.com successfully deleted\"\n        \n    - **Description:** This endpoint allows you to delete a person from the database by providing their unique email address in the URL. If a person with the specified email address is found and successfully deleted, the API responds with a `200 OK` status code and returns a confirmation message as a string. The message indicates that the person with the specified email address has been successfully deleted.\n        \n\nThis documentation provides clear guidance on how to use the DELETE request to delete a person by email address and explains the expected response when a person is successfully deleted.\n\n**DELETE Person by Email:**  \n  \nEndpoint: http://localhost:9002/api/{email}  \n  \nDescription: This DELETE request is used to delete a person based on their unique email address. If the provided email address does not exist in the system, the API responds with an error message.  \n  \n**Request:**  \n  \nMethod: DELETE  \nURL: http://localhost:9002/api/ebukizy123  \nThis URL includes the email address used to identify the person for deletion.  \n  \n**Error Response (400 Bad Request):**  \nBody:  \n{  \n\"errorCode\": 400,  \n\"errorMessage\": \"ebukizy123 does not exist\",  \n\"timestamp\": \"2023-09-15T12:37:10.936+00:00\"  \n}"
			},
			"response": []
		},
		{
			"name": "http://localhost:9002/api/ebukizy01@gmail.com",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"firstName\" : \"segun\",\n    \"lastName\" : \"lode\",\n    \"gender\" : \"MALE\",\n    \"address\":{\n        \"country\" : \"Nigeria\",\n        \"state\" : \"lagos\",\n        \"city\" : \"ikeja\",\n        \"streetAddress\" : \"No 7 tarjudeen street\" \n    }\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:9002/api/ebukizy01@gmail.com",
				"description": "**API Implementation Details:**\n\nThis API is implemented using Java with the Spring Boot framework.\n\n**PUT Update Person by Email:**\n\nEndpoint: http://localhost:9002/api/{email}\n\nDescription: This PUT request is used to update a person's information based on their unique email address. The email address is used to identify the person, and the request body contains the fields to be updated.\n\n**Request:**\n\nMethod: PUT\nURL: http://localhost:9002/api/ebukizy01@gmail.com\nThis URL includes the email address used to identify the person for the update.\n\n**Request Body:**\n```json\n{\n    \"firstName\": \"segun\",\n    \"lastName\": \"retnar\",\n    \"gender\": \"MALE\",\n    \"address\": {\n        \"country\": \"AMERICA\",\n        \"state\": \"NEW YORK\",\n        \"city\": \"New JERSEY\",\n        \"streetAddress\": \"No 7 Tarjudeen Street\"\n    }\n}\n\nDescription: This endpoint allows you to update a person's information by providing their unique email address in the URL. The request body contains the fields to be updated, including firstName, lastName, gender, and address. The email address (\"ebukizy01@gmail.com\") is used to identify the person to be updated.\nResponse:\n\nSuccess Response (200 OK):\n\nBody:\n{\n    \"id\": \"65033c6af7fb7769d3043884\",\n    \"firstName\": \"segun\",\n    \"lastName\": \"retnar\",\n    \"emailAddress\": \"ebukizy01@gmail.com\",\n    \"gender\": \"MALE\",\n    \"address\": {\n        \"addressId\": null,\n        \"country\": \"AMERICA\",\n        \"state\": \"NEW YORK\",\n        \"city\": \"New JERSEY\",\n        \"streetAddress\": \"No 7 Tarjudeen Street\"\n    }\n}\nDescription: If the update is successful, the API responds with a 200 OK status code and returns the updated person's details, including their unique identifier (id), updated firstName, lastName, emailAddress, gender, and address.\nThis documentation provides clear guidance on how to use the PUT request to update a person's information by email address and explains the expected response when the update is successful."
			},
			"response": []
		}
	]
}
## Name: E. Shyam Sunder Reddy
## TCS_EmpId: 2278249
### STEP-1: CREATING THE PROJECT USING CLI
mvn archetype:generate -DgroupId=com.shyam.data -DartifactId=assignment1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

### STEP-2: IMPORTING THE PROJECT INTO THE INTELLIJ
Import the created project as maven project into Intellij

### STEP-3: ADDING THE DEPENDENCIES TO THE POM.XML FILE
Add the latest version parent tag, Spring-starter,web,test dependencies and load the Maven project

### STEP-4: CREATING THE STUDENT CLASS
Create the student class containing 4 variables, generate parameterized constructor and default constructor,
Generate getters and setters for all the variables and generate toString()

### STEP-5: CREATING THE SPRINGBOOT APPLICATION AND CONTROLLER
Make the App class as the SpringBootApplication and create another class for the controller and make controller class as a RESTController
and give all the necessary annotations

### STEP-6: CREATING THE DEV PROFILE
Create a new file in the resources folder as application-dev.properties and give the server.port=8083
Now change the profile in the application.properties file as spring.profiles.active=dev

### STEP-6: BUILDING AND RUNNING THE CODE
Open the terminal and run "mvn clean install" command to build and then run the "mvn spring-boot:run" command to run the application

### STEP-7: TEST WITH POSTMAN
GET http://localhost:8083/get/student?name=shyam&rollNo=111
POST http://localhost:8083/post/student
PUT http://localhost:8083/put/student/Sunder
DELETE http://localhost:8083/delete/student?name=Shyam

### STEP-7 TEST WITH CURL

#### CURL GET:
curl --location --request GET 'http://localhost:8083/get/student?name=shyam&rollNo=111'

#### CURL POST:
curl --location --request POST 'localhost:8083/post/student/' \
--header 'Content-Type: application/json' \
--data-raw '{
"name": "Shyam",
"age": "23",
"rollNo": "D7",
"std": "Engineering"
}'
#### CURL PUT:
curl --location --request PUT 'http://localhost:8083/put/student/Sunder' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A6D93D5B9A0D159ED8B34210F28C5DA7' \
--data-raw '{
"name": "Shyam",
"age": "23",
"rollNo": "D7",
"std": "Engineering"
}'
#### CURL DELETE:
curl --location --request DELETE 'localhost:8083/delete/student?name=Shyam'



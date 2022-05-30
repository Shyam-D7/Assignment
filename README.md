[//]: # (make the app as the spring boot application and annotate with the necessary annotations)

[//]: # (now create a resources folder inside the main folder and create application.properties for both profiles)

[//]: # (now update the dev profile application.yml file with mysql -url, -user, -password details)

[//]: # (now create docker-compose-mysql.yml file in the project&#40;student&#41; directory)

[//]: # (update the docker-compose-mysql.yml file, inside the services give the image, environment variables, ports...)

[//]: # (create a students package which consists of controller, repository and security as the sub packages)

[//]: # (create a student class with all the variables and generate getters, setters and constructors)

[//]: # (now create a student repository interface which will extend the jpa repository, give the student class as entity and give it  @Id annotation to primary key)

[//]: # (now create a new class StudentNotFoundException extending the RuntimeException class)

[//]: # (now create a student controller and annotate it with rest controller)

[//]: # (now create student repository object variable and give it autowired annotation)

## Name: E. Shyam Sunder Reddy
## TCS_EmpId: 2278249

### STEP-1: CREATING THE PROJECT USING CLI
mvn archetype:generate -DgroupId=com.shyam.data -DartifactId=sfjbs_Assignment -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

### STEP-2: IMPORTING THE PROJECT INTO THE INTELLIJ
Import the created project as maven project into Intellij

### STEP-3: ADDING THE DEPENDENCIES TO THE POM.XML FILE
Add the latest version parent tag, Spring-starter,web,test, dependencies and load the Maven project
Add Spring JPA, Devtools, H2 database, Json dataFormat,security dependencies, and load the Maven project

### STEP-4: CREATING THE SPRINGBOOT APPLICATION
Make the App class as the SpringBootApplication and  give all the necessary annotations.

### STEP-5: CREATING THE DEV PROFILE
Create a new file in the resources folder as "application-dev.properties" and give the "server.port=8083"
Now change the profile in the application.properties file as "spring.profiles.active=dev"
In dev profile give the embedded database details like database url, driverClassName, userName, password, databasePlatform...

### STEP-6: CREATING THE STUDENT CLASS
Create the student class containing 5 variables, generate parameterized constructor and default constructor,
Generate getters and setters for all the variables and generate toString()
Annotate the student class @Entity and id variables with @Id annotation.
Create another class which is extending RuntimeException class, name it as "StudentNtFoundException"

### STEP-7: CREATING STUDENT DATABASE:
Create a jpa repository(right click on student package --> new --> spring Data --> projection ) and name it as StudentRepository.
Now give the @Repository annotation to the StudentRepository Interface.

### STEP-8: CREATING CONTROLLER:
Create a class for the controller and make controller class as a RESTController and declare a StudentRepository object variable and
annotate that object variable as "@Autowired".
Now give all the necessary mapping requests to the methods and annotate them as per the requirement.

### STEP-9: PROVIDING AUTHENTICATION
Create a class extending "WebSecurityConfigurerAdapter" class and add all the security dependencies in pom.xml file
Update the maven project
provide GET requests,DELETE requests  access to "user" roles only and PUT requests,POST requests access to only "admin" roles.
Define which type of requests need the authorisation.

### STEP-10: BUILDING AND RUNNING THE CODE
Open the terminal and run "mvn clean install" command to build and then run the "mvn spring-boot:run" command to run the application

### STEP-11: BUILDING THE DOCKER IMAGE AND RUNNING IT
After both the maven commands are successfully completed, run the following maven command in the terminal to build the Docker Image "mvn install dockerfile:build"
You can check whether the docker image is created or not by running the following command in the terminal "docker images", which will display all the docker images available.
Now run the following command "docker run -p 8083:8083 shyam_d7/assignment1:1.0-SNAPSHOT" (docker run -p <port:port> <repository-name>)
You can check the whether the above command is successful or not by running following command in the terminal "docker ps", if it is showing container id then it is running fine.

### STEP-11: TEST WITH POSTMAN
GET http://localhost:8083/students
POST http://localhost:8083/students
PUT http://localhost:8083/students/1
DELETE http://localhost:8083/students/1

### STEP-7 TEST WITH CURL

#### CURL POST:
curl --location --request POST 'localhost:8083/students' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=044C55AC02FEB6D4C16A30C754EAD225' \
--data-raw '{
"name": "Shyam",
"age": "23",
"rollNo": "D6",
"std": "Engineering"
}'

#### CURL GET:

curl --location --request GET 'localhost:8083/students' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=044C55AC02FEB6D4C16A30C754EAD225'

#### CURL PUT:
curl --location --request PUT 'localhost:8083/students/1' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=044C55AC02FEB6D4C16A30C754EAD225' \
--data-raw '{
"name": "Shyam",
"age": 23,
"rollNo": "D6",
"std": "Engineering"
}'
#### CURL DELETE:
curl --location --request DELETE 'localhost:8083/students/1' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=044C55AC02FEB6D4C16A30C754EAD225'




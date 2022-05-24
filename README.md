## Name: E. Shyam Sunder Reddy
## TCS_EmpId: 2278249

### STEP-1: CREATING THE PROJECT USING CLI
mvn archetype:generate -DgroupId=com.shyam.data.calculator.app -DartifactId=calculator -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

### STEP-2: IMPORTING THE PROJECT INTO THE INTELLIJ
Import the created project as maven project into Intellij

### STEP-3: ADDING THE DEPENDENCIES TO THE POM.XML FILE
Add the latest version parent tag, Spring-starter,web,test, dependencies and load the Maven project

### STEP-4: CREATING THE SPRINGBOOT APPLICATION
Create a class named as CalculatorApp and make that class as the SpringBootApplication and  give all the necessary annotations.

### STEP-5: CREATING THE OPERATIONS CLASS
Now create the Operations class and create methods for addition, subtraction, multiplication, division.
create

### STEP-6: CREATING THE REST CONTROLLER
Create a class named as Controller and give @GetMappings annotations to all the methods and give the url in the GetMapping.
Create a Operations class object and annotate it with "@Autowired" annotation.

### STEP-7: BUILDING AND RUNNING THE CODE
Open the terminal and run "mvn clean install" command to build and then run the "mvn spring-boot:run" command to run the application

### STEP-11: TEST WITH POSTMAN
GET http://localhost:8080/add?a=2&b=5
GET http://localhost:8080/sub?a=2&b=5
GET http://localhost:8080/multi?a=2&b=5
GET http://localhost:8080/div?a=2&b=5
GET http://localhost:8080/oops

### STEP-7 TEST WITH CURL

#### CURL GET:
curl --location --request GET 'localhost:8080/add?a=2&b=5'
curl --location --request GET 'localhost:8080/sub?a=2&b=5'
curl --location --request GET 'localhost:8080/multi?a=2&b=5'
curl --location --request GET 'localhost:8080/div?a=2&b=5'
curl --location --request GET 'localhost:8080/oops'


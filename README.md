# student-info-springboot
created GET, PUT, POST endpoints for Student Class. Springboot project. Swagger

Spring-web contains an embedded Tomcat server. Maven script mvnw allows to execute the server locally on http://localhost:8080.


## Student Class
this class contains attributes as:
__stid:__ `integer` type. unique identification of data values. Value is incremented after every addition.

__dateOfBirth:__ `String` type. TODO convert string to Date object type.

_fname , mname, lname:_ `String` type. first name, middle name, last name.

__semester:__ `integer` type.

__course:__ `String` type. eg: BTECH, BBA, MBA, MTECH, BCOM, etc.

__subjects:__ `HashMap <String, Float>`. String contains subject code eg: `DAA`,`DBMS`,`FOC`,`OOP` etc. Float contains marks of
in that mapped subject string.

## AppService
This class contains all the methods carry out operations on the JSON objects received from RestController.
This class is annotated with `@Component` annotation.

this class contains a HashMap <Integer, Student> for storing the instances of different Student records. `Integer` correponds to
unique id of each record. This unique id is also used for `stid` in Student class.


## StudentRestController
Contains logic with `@RestController`. Contains endpoint mapping annotations for different operations. GET,POST, PUT.

An instance of `AppService` is created for connecting instance manipulation methods with the RestController.
Instance is `@Autowired` annotated to inject `AppService` object.

### Mappings
* `GET` show details of student by ID: @GetMapping("/student/{StudentId-Passed}"). eg: localhost:8080/student/2.
  Student displayById(int id)
  
* `GET` show all details of all students: @GetMapping("/student/showall"). HashMap<Integer, Student> displayAll()

* `POST` add a new student record:@PostMapping(value = "/student/addnew"). Used @RequestBody annotation to map JSON passed from POST to be
stored as Student object for insertion.

* `PUT` update record of an exisiting student by ID: @PutMapping("/student/{studentId}"). eg: localhost:8080/student/2. Used 
  @PathVariable annotation to get studentid from URL and store it in `studentId` parameter of updateStudent() method. 
  @RequestBody annotation ensures updated parameters are recieved for replacing.


## Swagger
Used to generate endpoints' documentation for understanding on how to consume these endpoints.

Dependencies: 
- springfox-swagger2
- swagger-ui

@EnableSwagger2 on StudentRestController.java to enable swagger backend task of generating documentation of endpoint.
Access JSON representation by http://localhost:8080/v2/api-docs
Swagger-ui enables better readability and understanding of endpoins. http://localhost:8080/swagger-ui.html


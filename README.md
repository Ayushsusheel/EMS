# EMS
Hi, this repository consists the code for the Employee Management System. 

* Development of the Backend part using Spring MVC.
* Creating the main class (@SpringBootApplication :- tells that yes, this is a springboot app not normal java program)

===========================================================================================================

-------------------------------
|| * Creating the Controller ||
-------------------------------  
* (@RestController :- Controller containing Rest API's)
* @RequestMapping("/employees") as soon as the API is hit (localhost/portNumber/employees) the execution of the program will come in this controller class and according to the url we can perform actions like
* @GetMapping(value="/details")
* @PostMapping(value="/add")
* @GetMapping("/details/{id}") means :- www.employeeManagementSystem.com/details/1 so this will fetch the details of that employee who have the id as 1 here,setting the EMP__ID as primary key comes into picture.
* @PutMapping("/details/{id}") :- in order to update the record/details of the employee using his/her EMP__ID.
* @DeleteMapping("/details/{id}") :- delete the record/details on an employee based on the employee ID.

===========================================================================================================

* Creating classes for exception handling
* Creating the table using @Table(name="employee_management_table") we use @Id,@Column,@GeneratedValue(strategy=GenerationType.AUTO) means auto increment the ID.
* Creating DTO layer (get and set the values)
* Creating Service (add detail,delete detail,update detail,getALl details,getDetailByID)
* Creating the implementations for all these services/microservices...

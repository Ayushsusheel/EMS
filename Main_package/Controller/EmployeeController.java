package Main_package.controller;

import java.util.List;

@RestController
/*@RequestMapping(value="/api") */ @RequestMapping("/employees")
public class EmployeeController 
{
    @Autowired
	private EmployeeService empservice;
	
//	public EmployeeController(EmployeeService empservice) {
//		super();
//		this.empservice = empservice;
//	}

	
	//building rest api CREATE
	//@PostMapping(value="/employees",consumes=MediaType.APPLICATION_JSON_VALUE)  //----via postmapping we got json object and now we have to map with employee obj therefore use request body
	
    
    
    
    
    @PostMapping(value="/add")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{	
	   
		return new ResponseEntity<>(empservice.savedetails(employee),HttpStatus.OK); //ok--200 
    
	}
    
    
    //get all details 2nd rest api
    
    @GetMapping(value="/details")
    public List<Employee> getall()
    {
    	return empservice.getAllDetails();
    }
    
    
    //get details by ID 3rd rest api
    
    @GetMapping("/details/{id}")
    public ResponseEntity<Employee> getdetailsbyID(@PathVariable("id") Integer ID) 
    {
    	return new ResponseEntity<Employee>(empservice.getdetailsbyID(ID),HttpStatus.OK);
//    	return null;
    }
    
    
    //UPDATE 4th API
	
    @PutMapping("/details/{id}")
    public ResponseEntity<Employee> update(@PathVariable ("id")Integer id,@RequestBody Employee obj)
    {
    
    	return new ResponseEntity<Employee>(empservice.update(obj, id),HttpStatus.OK);
    	
    }
	
    
    
    //5th DELETE API
    @DeleteMapping("/details/{id}")
    public ResponseEntity<String> delete(@PathVariable ("id") Integer id)//ResponseEntity represents an HTTP response, including headers, body, and status
    {
    
    	//delete from DB
    	empservice.deletedetails(id);
    	
    	return new ResponseEntity<String>("DELETED RECORD SUCCESSFULLY.....",HttpStatus.OK);
    	
    	
    	
    	
    }
    
    
}

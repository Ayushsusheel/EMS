package Main_package.repository;

import org.springframework.data.jpa.repository.JpaRepository;


//@Repository
//@Transactional  no need to add this jpa internally provides this

public interface EmployeeRepository extends JpaRepository<Employee,Integer>  //it is Integer here not long 
{

	
}

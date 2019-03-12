package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Employee;
import repo.EmployeeRepository;

public class EmployeeDao {
	
	@Autowired
	EmployeeRepository empRep;
	
	public Employee save(Employee emp) 
	{
		return empRep.save(emp);
		
	}
	
	public List<Employee> findAll(){
		return empRep.findAll();
	}
	
	public void delete (Employee emp) 
	{
		 empRep.delete(emp);
		
	}
	
	
}

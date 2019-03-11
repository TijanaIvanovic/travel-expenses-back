package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Employee;
import repo.EmployeeRepository;

public class EmployeeDao {
	
	@Autowired
	EmployeeRepository empRep;
	//da li ovo moze ovako
	
	public Employee findOne(Integer ide) 
	{
		return empRep.findJustOne(ide);
		
	}

	
	public Employee save(Employee emp) 
	{
		return empRep.save(emp);
		
	}
	
	public List<Employee> findAll(Employee emp){
		return empRep.findAll();
	}
	
	public void delete (Employee emp) 
	{
		 empRep.delete(emp);
		
	}
	
	
}

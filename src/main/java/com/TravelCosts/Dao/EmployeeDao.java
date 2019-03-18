package com.TravelCosts.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Repository.EmployeeRepository;

@Component
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
	
	
	public Employee getEmployeeByName(String fname, String lname) {
		return empRep.getEmployeeByName(fname, lname);
	}
	

	
	
}

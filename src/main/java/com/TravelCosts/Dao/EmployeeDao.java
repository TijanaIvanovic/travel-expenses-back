package com.TravelCosts.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Repository.EmployeeRepository;

@Repository
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
	

	
	
}

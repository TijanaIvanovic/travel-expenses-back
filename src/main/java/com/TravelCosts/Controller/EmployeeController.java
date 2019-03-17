package com.TravelCosts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Service.*;

import java.util.List;

@RestController
public class EmployeeController {	
	@Autowired
	EmployeeService eService;
	
	@GetMapping(path="employees")	
	public List<Employee> getAllEmployees(){
		return eService.findAll();	
	}
	
	@PostMapping(path="employee")
	public void createNewEmployee(@RequestBody Employee e) {
		eService.createEmployee(e);
	}	
	
	

}



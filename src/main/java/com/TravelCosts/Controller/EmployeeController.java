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
	EmployeeService emps;
	
	@GetMapping(path="employees")	
	public List<Employee> getAllEmployees(){

		return emps.listEmployees();	
	}
	
	@PostMapping(path="employee")
	public void createEmployee(@RequestBody Employee e) {
		System.out.println("Hello" + e.toString());
		emps.createEmp(e);
	}	
	
	@PostMapping(path="employeeupdate")
	public void updateEmployee(@RequestBody Employee e) {
		System.out.println("Hello" + e.toString());
		emps.createEmp(e);
	}	

}



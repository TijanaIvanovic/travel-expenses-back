package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Service.EmployeeService;

@RestController
public class EmployeeController {	
	@Autowired
	EmployeeService eService;
	
	@CrossOrigin(origins = "http://localhost:4200", allowCredentials="true", allowedHeaders="true")

	@GetMapping(path="employees")	
	public List<Employee> getAllEmployees(){
		return eService.findAll();	
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path="employee")
	public void createNewEmployee(@RequestBody Employee e) {
		eService.createEmployee(e);
	}	
	
//	@GetMapping(path="byname")
//	public Employee getEmployeeByName(@RequestParam String fname, @RequestParam String lname) {
//		return eService.getEmployeeByName(fname, lname);
//		
//	}
	

}



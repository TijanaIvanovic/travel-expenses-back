package com.TravelCosts.TravelCosts;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


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
}



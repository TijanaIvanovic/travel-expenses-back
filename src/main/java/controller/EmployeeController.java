package controller;
import Model.Employee;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import DAO.EmployeeDao;
import Model.Employee;

import service.EmployeeService;

@RestController
public class EmployeeController {	
	@Autowired
	EmployeeService emps;
	
	@GetMapping("/employees")	
	public List<Employee> getAllEmployees(){
		return emps.listEmployees();	
	}
	@GetMapping("/test")
	public void test() {
		System.out.println("test");
	}	 

	
}



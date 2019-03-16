package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Model.Tripofemployee;
import com.TravelCosts.Service.EmployeeService;
import com.TravelCosts.Service.TripOfEmployeeService;

@RestController
public class TripOfEmployeeController {
	@Autowired
	TripOfEmployeeService tops;
	
	@GetMapping(path="tripsofemployee")	
	public List<Tripofemployee> getAllTripsOfEmployee(){

		return tops.listTripsOfEmployee();	
	}
	
	@PostMapping(path="tripofemployee")
	public void createEmployee(@RequestBody Tripofemployee top) {
		System.out.println("Hello" + top.toString());
		tops.createTop(top);
	}	
	

}

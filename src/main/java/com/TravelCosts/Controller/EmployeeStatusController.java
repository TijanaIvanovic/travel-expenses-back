package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Employeestatus;

import com.TravelCosts.Service.EmployeestatusService;

@RestController
public class EmployeeStatusController {
	@Autowired
	EmployeestatusService esService;
	
	@GetMapping(path="statuses")	
	public List<Employeestatus> getAllStatuses(){
		return esService.listEmployeestatuses();	
	}
	
	@PostMapping(path="status")
	public void createRole(@RequestBody Employeestatus empst) {
		esService.createEmployeeStatus(empst);
		
	}


}

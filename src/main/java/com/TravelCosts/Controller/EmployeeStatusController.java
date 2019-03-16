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
	EmployeestatusService empstService;
	
	@GetMapping(path="statuses")	
	public List<Employeestatus> getAllStatuses(){
		return empstService.listEmployeestatuses();	
	}
	
	@PostMapping(path="status")
	public void createRole(@RequestBody Employeestatus empst) {
		empstService.createEmployeeStatus(empst);
		
	}
	
	@PostMapping(path="statusdel")
	public void deleteRole(@RequestBody Employeestatus empst) {
		empstService.deleteEmployeeStatus(empst);
	}

}

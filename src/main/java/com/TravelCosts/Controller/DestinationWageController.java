package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Destinationwage;
import com.TravelCosts.Service.DestinationWageService;

@RestController
public class DestinationWageController {
	
	@Autowired
	DestinationWageService dwService;
	
	@GetMapping(path="destinationwages")
	public List<Destinationwage> getAllDestinationWages(){
		return dwService.findAll();
	}
	
	@PostMapping(path="destinationwage")
	public void createNewDestinationWage(Destinationwage dw) {
		dwService.createDestinationWage(dw);
	}

}

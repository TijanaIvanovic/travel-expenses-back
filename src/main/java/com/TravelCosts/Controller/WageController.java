package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Wage;
import com.TravelCosts.Service.WageService;

@RestController
public class WageController {
	@Autowired
	WageService wService;
	
	@GetMapping(path="wages")
	public List<Wage> getAllWages(){
		return wService.findAll();
	}
	@PostMapping(path="wage")
	public void createNewWage(Wage w) {
		wService.createWage(w);
	}
	

}

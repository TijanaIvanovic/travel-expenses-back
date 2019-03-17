package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Businesstrip;
import com.TravelCosts.Service.BusinessTripService;

@RestController
public class BusinessTripController {
	@Autowired
	BusinessTripService btService;
	
	@GetMapping(path="businesstrips")
	public List<Businesstrip> getAllBusinessTrips(){
		return btService.findAll();
	}
	
	@PostMapping(path="businesstrip")
	public void createNewBusinessTrip(@RequestBody Businesstrip bt) {
		btService.createBusinessTrip(bt);
	}

}

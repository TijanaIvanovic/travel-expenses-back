package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Destination;
import com.TravelCosts.Service.DestinationService;

@RestController
public class DestinationController {
	@Autowired
	DestinationService dService;
	
	@GetMapping(path="destinations")
	public List<Destination> getAllDestinations(){
		return dService.findAll();
	}
	
	@PostMapping(path="destination")
	public void createNewDestination(Destination d) {
		dService.createDestination(d);
	}

}

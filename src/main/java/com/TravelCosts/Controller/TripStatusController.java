package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Tripstatus;
import com.TravelCosts.Service.TripStatusService;

@RestController
public class TripStatusController {
	@Autowired
	TripStatusService tsService;
	
	@GetMapping(path="tripstatuses")
	public List<Tripstatus> getAllTripStatuses(){
		return tsService.findAll();
	}
	
	@PostMapping(path="tripstatus")
	public void createNewTripStatus(Tripstatus ts) {
		tsService.createTripStatus(ts);
	}
}

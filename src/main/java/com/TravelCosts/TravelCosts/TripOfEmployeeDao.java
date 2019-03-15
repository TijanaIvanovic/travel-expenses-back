package com.TravelCosts.TravelCosts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



public class TripOfEmployeeDao {

	@Autowired
	TripOfEmployeeRepository toe;


	
	public Tripofemployee save(Tripofemployee t) 
	{
		return toe.save(t);
		
	}
	
	public List<Tripofemployee> findAll(Tripofemployee t){
		return toe.findAll();
	}
	
	public void delete (Tripofemployee t) 
	{
		 toe.delete(t);
		
	}
}

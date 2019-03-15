package com.TravelCosts.TravelCosts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class TripStatusDao {
	
	@Autowired
	TripStatusRepository tRep;
	
	
	public Tripstatus save(Tripstatus t) 
	{
		return tRep.save(t);
		
	}
	
	public List<Tripstatus> findAll(Tripstatus t){
		return tRep.findAll();
	}
	
	public void delete (Tripstatus t) 
	{
		 tRep.delete(t);
		
	}
	
}

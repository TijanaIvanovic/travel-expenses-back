package com.TravelCosts.TravelCosts;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class DestinationDao {
	@Autowired
	DestinationRepository dRep;


	
	public Destination save(Destination d) 
	{
		return dRep.save(d);
		
	}
	
	public List<Destination> findAll(Destination d){
		return dRep.findAll();
	}
	
	public void delete (Destination d) 
	{
		 dRep.delete(d);
		
	}
	
}

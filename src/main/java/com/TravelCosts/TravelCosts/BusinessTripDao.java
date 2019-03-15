package com.TravelCosts.TravelCosts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class BusinessTripDao {
	
	@Autowired
	BusinessTripRepository bRep;


	
	public Businesstrip save(Businesstrip b) 
	{
		return bRep.save(b);
		
	}
	
	public List<Businesstrip> findAll(Businesstrip b){
		return bRep.findAll();
	}
	
	public void delete (Businesstrip b) 
	{
		 bRep.delete(b);
		
	}
	
}

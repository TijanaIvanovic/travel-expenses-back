package com.TravelCosts.TravelCosts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class WageDao {
	
	@Autowired
	WageRepository wRep;
	
	
	public Wage save(Wage w) 
	{
		return wRep.save(w);
		
	}
	
	public List<Wage> findAll(Wage w){
		return wRep.findAll();
	}
	
	public void delete (Wage w) 
	{
		wRep.delete(w);
		
	}
	
}

package com.TravelCosts.TravelCosts;
import java.util.List;



public class DestinationWageDao {
	DestinationWageRepository dwRep;
	
	public Destinationwage save(Destinationwage dw) 
	{
		return dwRep.save(dw);
		
	}
	
	public List<Destinationwage> findAll(Destinationwage dw){
		return dwRep.findAll();
	}
	
	public void delete (Destinationwage dw) 
	{
		dwRep.delete(dw);
		
	}
	

}

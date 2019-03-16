package com.TravelCosts.Dao;
import java.util.List;

import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Destinationwage;
import com.TravelCosts.Repository.DestinationWageRepository;


@Component
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

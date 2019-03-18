package com.TravelCosts.Dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Destinationwage;
import com.TravelCosts.Repository.DestinationWageRepository;


@Component
public class DestinationWageDao {
	
	@Autowired
	DestinationWageRepository dwRep;
	
	public Destinationwage save(Destinationwage dw) 
	{
		return dwRep.save(dw);
		
	}
	
	public List<Destinationwage> findAll(){
		return dwRep.findAll();
	}

	

}

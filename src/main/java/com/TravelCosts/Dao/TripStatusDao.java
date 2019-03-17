package com.TravelCosts.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Tripstatus;
import com.TravelCosts.Repository.TripStatusRepository;

@Component
public class TripStatusDao {
	
	@Autowired
	TripStatusRepository tRep;
	
	
	public Tripstatus save(Tripstatus ts) 
	{
		return tRep.save(ts);
		
	}
	
	public List<Tripstatus> findAll(){
		return tRep.findAll();
	}
	

	
}

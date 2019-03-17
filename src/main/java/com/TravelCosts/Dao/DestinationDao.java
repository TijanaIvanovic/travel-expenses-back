package com.TravelCosts.Dao;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Destination;
import com.TravelCosts.Repository.DestinationRepository;

@Component
public class DestinationDao {
	@Autowired
	DestinationRepository dRep;

	
	public Destination save(Destination d) 
	{
		return dRep.save(d);
		
	}
	
	public List<Destination> findAll(){
		return dRep.findAll();
	}

}

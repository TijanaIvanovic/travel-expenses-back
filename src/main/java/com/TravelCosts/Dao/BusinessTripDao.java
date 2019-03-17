package com.TravelCosts.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Businesstrip;
import com.TravelCosts.Repository.BusinessTripRepository;
@Component
public class BusinessTripDao {
	
	@Autowired
	BusinessTripRepository btRep;

	
	public Businesstrip save(Businesstrip b) 
	{
		return btRep.save(b);
		
	}
	
	public List<Businesstrip> findAll(){
		return btRep.findAll();
	}
	

	
}

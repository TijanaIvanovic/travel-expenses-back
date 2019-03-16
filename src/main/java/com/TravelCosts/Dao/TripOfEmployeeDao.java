package com.TravelCosts.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Tripofemployee;
import com.TravelCosts.Repository.TripOfEmployeeRepository;


@Component
public class TripOfEmployeeDao {

	@Autowired
	TripOfEmployeeRepository toe;


	
	public Tripofemployee save(Tripofemployee t) 
	{
		return toe.save(t);
		
	}
	
	public List<Tripofemployee> findAll(Tripofemployee t){
		return toe.findAll();
	}
	
	public void delete (Tripofemployee t) 
	{
		 toe.delete(t);
		
	}
}

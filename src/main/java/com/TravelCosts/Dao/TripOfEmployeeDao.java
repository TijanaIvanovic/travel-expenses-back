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
	TripOfEmployeeRepository toeRep;

	
	public Tripofemployee save(Tripofemployee top) 
	{
		return toeRep.save(top);
		
	}
	
	public List<Tripofemployee> findAll(){
		return toeRep.findAll();
	}
	

}

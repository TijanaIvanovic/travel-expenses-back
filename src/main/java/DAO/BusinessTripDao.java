package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.BusinessTrip;
import repo.BusinessTripRepository;

public class BusinessTripDao {
	
	@Autowired
	BusinessTripRepository bRep;
	
	public BusinessTrip findOne(Integer idbt) 
	{
		return bRep.findJustOne(idbt);
		
	}

	
	public BusinessTrip save(BusinessTrip b) 
	{
		return bRep.save(b);
		
	}
	
	public List<BusinessTrip> findAll(BusinessTrip b){
		return bRep.findAll();
	}
	
	public void delete (BusinessTrip b) 
	{
		 bRep.delete(b);
		
	}
	
}

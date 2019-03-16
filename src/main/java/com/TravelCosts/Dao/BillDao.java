package com.TravelCosts.Dao;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Bill;
import com.TravelCosts.Repository.BillRepository;

@Component
public class BillDao {
	
	@Autowired
	BillRepository billRep;
	
	
	public Bill save(Bill b) 
	{
		return billRep.save(b);
		
	}
	
	public List<Bill> findAll(Bill b){
		return billRep.findAll();
	}
	
	public void delete (Bill b) 
	{
		 billRep.delete(b);
		
	}
	

	
}

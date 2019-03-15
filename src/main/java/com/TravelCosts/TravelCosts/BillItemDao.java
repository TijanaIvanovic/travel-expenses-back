package com.TravelCosts.TravelCosts;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class BillItemDao {
	
	@Autowired
	BillItemRepository BillItemRep;
	
	
	public Billitem save(Billitem b) 
	{
		return BillItemRep.save(b);
		
	}
	
	public List<Billitem> findAll(Billitem b){
		return BillItemRep.findAll();
	}
	
	public void delete (Billitem b) 
	{
		 BillItemRep.delete(b);
		
	}

}

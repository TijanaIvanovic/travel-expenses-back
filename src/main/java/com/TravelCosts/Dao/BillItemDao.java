package com.TravelCosts.Dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Billitem;
import com.TravelCosts.Repository.BillItemRepository;
@Component
public class BillItemDao {
	
	@Autowired
	BillItemRepository BillItemRep;
	
	
	public Billitem save(Billitem b){		
		return BillItemRep.save(b);
		
	}
	
	public List<Billitem> findAll(){
		return BillItemRep.findAll();
	}
	


}

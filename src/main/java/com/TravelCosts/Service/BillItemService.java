package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.BillItemDao;
import com.TravelCosts.Model.Billitem;

@Service
public class BillItemService {
	
	@Autowired
	BillItemDao biDao;
	
	public List<Billitem> findAll(){
		return biDao.findAll();
	}
	
	public void createBillItem(Billitem b) {
		biDao.save(b);
	}
	
}

package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.BillDao;
import com.TravelCosts.Model.Bill;

@Service
public class BillService {
	@Autowired
	BillDao bDao;
	
	public List<Bill> findAll(){
		return bDao.findAll();
	}
	
	public void createBill(Bill b) {
		bDao.save(b);
	}
		

}

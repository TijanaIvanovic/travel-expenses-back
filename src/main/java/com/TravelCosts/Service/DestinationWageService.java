package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.DestinationWageDao;
import com.TravelCosts.Model.Destinationwage;

@Service
public class DestinationWageService {
	
	@Autowired
	DestinationWageDao dwDao;
	
	public List<Destinationwage> findAll(){
		return dwDao.findAll();
	}
	
	public void createDestinationWage(Destinationwage dw) {
		dwDao.save(dw);
	}
	
	

}

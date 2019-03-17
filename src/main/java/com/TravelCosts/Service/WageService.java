package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.WageDao;
import com.TravelCosts.Model.Wage;

@Service
public class WageService {
	
	@Autowired
	WageDao wDao;
	
	public List<Wage> findAll(){
		return wDao.findAll();
	}
	
	public void createWage(Wage w) {
		wDao.save(w);
	}

}

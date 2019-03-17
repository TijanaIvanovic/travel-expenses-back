package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.BusinessTripDao;
import com.TravelCosts.Model.Businesstrip;

@Service
public class BusinessTripService {
	
	@Autowired
	BusinessTripDao btDao;
	
	public List<Businesstrip> findAll(){
		return btDao.findAll();
	}
	
	public void createBusinessTrip(Businesstrip bt) {
		btDao.save(bt);
	}

}

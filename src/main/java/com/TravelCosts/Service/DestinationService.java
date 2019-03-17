package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.DestinationDao;
import com.TravelCosts.Model.Destination;

@Service
public class DestinationService {
	@Autowired
	DestinationDao dDao;
	
	public List<Destination> findAll(){
		return dDao.findAll();
	}
	
	public void createDestination(Destination d) {
		dDao.save(d);
	}

}

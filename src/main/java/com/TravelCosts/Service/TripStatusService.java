package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.TripStatusDao;
import com.TravelCosts.Model.Tripstatus;

@Service
public class TripStatusService {
	@Autowired
	TripStatusDao tsDao;
	
	public List<Tripstatus> findAll(){
		return tsDao.findAll();
	}
	
	public void createTripStatus(Tripstatus ts) {
		tsDao.save(ts);
	}

}

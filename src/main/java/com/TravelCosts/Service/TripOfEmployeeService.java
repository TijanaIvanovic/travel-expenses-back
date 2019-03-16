package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.EmployeeDao;
import com.TravelCosts.Dao.TripOfEmployeeDao;
import com.TravelCosts.Model.Employee;
import com.TravelCosts.Model.Tripofemployee;

@Service
public class TripOfEmployeeService {
	@Autowired
	private TripOfEmployeeDao topDao;
	
	
	public List<Tripofemployee> listTripsOfEmployee(){
		return topDao.findAll();
	}
	
	public void createTop(Tripofemployee top) {
		topDao.save(top);
	}
	


}

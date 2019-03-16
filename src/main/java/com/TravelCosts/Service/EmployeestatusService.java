package com.TravelCosts.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.EmployeeStatusDao;
import com.TravelCosts.Model.Employeestatus;

@Service
public class EmployeestatusService {
	@Autowired
	private EmployeeStatusDao empstDao;
	
	
	public List<Employeestatus> listEmployeestatuses(){
		return empstDao.findAll();
	}
	
	public void createEmployeeStatus(Employeestatus emps) {
		empstDao.save(emps);
	}
	
	public void deleteEmployeeStatus(Employeestatus emps) {
		empstDao.delete(emps);
	}

}

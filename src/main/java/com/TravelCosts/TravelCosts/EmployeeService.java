package com.TravelCosts.TravelCosts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
	
	public List<Employee> listEmployees(){
		return empDao.findAll();
	}
	
	public void createEmp(Employee e) {
		empDao.save(e);
	}
	

}

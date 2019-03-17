package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.*;
import com.TravelCosts.Model.Employee;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
	
	public List<Employee> findAll(){
		return empDao.findAll();
	}
	
	public void createEmployee(Employee e) {
		empDao.save(e);
	}
	


}

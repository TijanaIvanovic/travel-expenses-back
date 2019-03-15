package com.TravelCosts.TravelCosts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeStatusDao {
	@Autowired
	EmployeeStatusRepository empStat;
	
	
	public Employeestatus save(Employeestatus emp) 
	{
		return empStat.save(emp);
		
	}
	
	public List<Employeestatus> findAll(Employeestatus emp){
		return empStat.findAll();
	}
	
	public void delete (Employeestatus emp) 
	{
		 empStat.delete(emp);
		
	}
}

package com.TravelCosts.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Employeestatus;
import com.TravelCosts.Repository.EmployeeStatusRepository;

@Component
public class EmployeeStatusDao {
	@Autowired
	EmployeeStatusRepository empStat;
	
	
	public Employeestatus save(Employeestatus emp) 
	{
		return empStat.save(emp);
		
	}
	
	public List<Employeestatus> findAll(){
		return empStat.findAll();
	}
	
	public void delete (Employeestatus emp) 
	{
		 empStat.delete(emp);
		
	}
}

package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.EmployeeStatus;
import repo.EmployeeStatusRepository;

public class EmployeeStatusDao {
	@Autowired
	EmployeeStatusRepository empStat;
	
	public EmployeeStatus findOne(Integer ides) 
	{
		return empStat.findJustOne(ides);
		
	}

	
	public EmployeeStatus save(EmployeeStatus emp) 
	{
		return empStat.save(emp);
		
	}
	
	public List<EmployeeStatus> findAll(EmployeeStatus emp){
		return empStat.findAll();
	}
	
	public void delete (EmployeeStatus emp) 
	{
		 empStat.delete(emp);
		
	}
}

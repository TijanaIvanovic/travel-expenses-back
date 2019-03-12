package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import DAO.EmployeeDao;
import Model.Employee;
import repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
	
	public List<Employee> listEmployees(){
		return empDao.findAll();
	}

}

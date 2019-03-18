package com.TravelCosts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query(value="SELECT e FROM Employee e WHERE firstname = ?1 AND lastname = ?2")
	 Employee getEmployeeByName(String fname, String lname);
	
}

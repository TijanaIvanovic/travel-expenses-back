package com.TravelCosts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Model.Role;

@Component
public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	@Query(value="SELECT r FROM Role r WHERE name = ?1")
	 Role getRoleByName(String name);


}

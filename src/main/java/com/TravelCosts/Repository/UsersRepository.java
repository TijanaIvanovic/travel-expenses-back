package com.TravelCosts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Model.Users;


public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	@Query(value="SELECT u FROM Users u WHERE username = ?1 AND password = ?2")
	 Users getUser(String username, String password);
	

}

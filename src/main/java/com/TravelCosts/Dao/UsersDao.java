package com.TravelCosts.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Model.Users;
import com.TravelCosts.Repository.UsersRepository;

@Component
public class UsersDao {
	
	@Autowired
	UsersRepository uRep;
	
	
	public Users save(Users u) 	{
		return uRep.save(u);
		
	}
	
	public List<Users> findAll(){
		return uRep.findAll();
	}
	
	public Users getUser(String username, String password) {
		return uRep.getUser(username, password);
	}
	
}

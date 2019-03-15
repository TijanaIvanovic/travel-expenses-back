package com.TravelCosts.TravelCosts;

import java.util.List;
import java.util.Optional;


public class UsersDao {
	
	UsersRepository uRep;
	
	
	public Users save(Users u) 
	{
		return uRep.save(u);
		
	}
	
	public List<Users> findAll(Users u){
		return uRep.findAll();
	}
	
	public void delete (Users u) 
	{
		 uRep.delete(u);
		
	}
	
}

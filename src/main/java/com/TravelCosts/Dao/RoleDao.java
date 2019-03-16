package com.TravelCosts.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Role;
import com.TravelCosts.Repository.RoleRepository;

@Component
public class RoleDao {
	
	@Autowired
	RoleRepository rRep;

	
	public Role save(Role r) 
	{
		return rRep.save(r);
		
	}
	
	public List<Role> findAll(){
		return rRep.findAll();
	}
	
	public void delete (Role r) 
	{
		 rRep.delete(r);
		
	}
	
}

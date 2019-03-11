package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Role;
import repo.RoleRepository;

public class RoleDao {
	
	@Autowired
	RoleRepository rRep;
	
	public Role finOne(Integer idr) 
	{
		return rRep.findJustOne(idr);
		
	}

	
	public Role save(Role r) 
	{
		return rRep.save(r);
		
	}
	
	public List<Role> findAll(Role r){
		return rRep.findAll();
	}
	
	public void delete (Role r) 
	{
		 rRep.delete(r);
		
	}
	
}

package com.TravelCosts.TravelCosts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
	@Autowired
	private RoleDao rDao;
	
	
	public List<Role> listRoles(){
		return rDao.findAll();
	}
	
	public void createRole(Role r) {
		rDao.save(r);
		
	}

}

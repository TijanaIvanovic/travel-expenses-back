package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.RoleDao;
import com.TravelCosts.Model.Role;

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
	
	public void deleteRole(Role r) {
		rDao.delete(r);
	}

}

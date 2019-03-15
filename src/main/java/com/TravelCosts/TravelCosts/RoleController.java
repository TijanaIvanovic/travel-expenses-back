package com.TravelCosts.TravelCosts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	@Autowired
	RoleService roleService;
	
	@GetMapping(path="roles")	
	public List<Role> getAllRoles(){
		return roleService.listRoles();	
	}
	
	@PostMapping(path="role")
	public void createRole(@RequestBody Role r) {
		roleService.createRole(r);
		
	}

}

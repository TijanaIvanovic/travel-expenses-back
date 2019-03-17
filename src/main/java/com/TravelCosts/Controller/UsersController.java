package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Users;
import com.TravelCosts.Service.UsersService;

@RestController
public class UsersController {
	@Autowired
	UsersService uService;
	
	@GetMapping(path="users")
	public List<Users> getAllUsers(){
		return uService.findAll();
	}
	
	@PostMapping(path="user")
	public void createNewUser(Users u) {
		uService.createUser(u);
	}

}

package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Employee;
import com.TravelCosts.Model.Users;
import com.TravelCosts.Service.EmployeeService;
import com.TravelCosts.Service.UsersService;

@RestController
public class UsersController {
	@Autowired
	UsersService uService;
	
	@Autowired
	EmployeeService eService;
	
	@GetMapping(path="users")
	public List<Users> getAllUsers(){
		return uService.findAll();
	}
	
	@PostMapping(path="user")
	public void createNewUser(@RequestBody Users u) {
		uService.createUser(u);
	}
	
	@GetMapping(path="byname")
	public Employee getEmployeeByName(@RequestParam String fname, @RequestParam String lname) {
		return eService.getEmployeeByName(fname, lname);
		
	}
	
	@GetMapping(path="login")
	public Users getUser(@RequestParam String username, @RequestParam String password) {
		return uService.getUser(username, password);
	}

}

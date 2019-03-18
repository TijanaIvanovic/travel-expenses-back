package com.TravelCosts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelCosts.Dao.UsersDao;
import com.TravelCosts.Model.Employee;
import com.TravelCosts.Model.Users;

@Service
public class UsersService {
	@Autowired
	UsersDao uDao;
	
	public List<Users> findAll(){
		return uDao.findAll();
	}
	
	public void createUser(Users u) {
		uDao.save(u);
	}
	
	public Users getUser(String username, String password) {
		return uDao.getUser(username, password);
	}

}

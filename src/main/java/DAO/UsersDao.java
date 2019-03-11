package DAO;

import java.util.List;
import java.util.Optional;

import Model.Users;
import repo.UsersRepository;

public class UsersDao {
	
	UsersRepository uRep;
	
	public Users findOne(Integer idu) 
	{
		return uRep.findJustOne(idu);
		
	}

	
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

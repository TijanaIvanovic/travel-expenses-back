package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.TripOfEmployee;
import repo.TripOfEmployeeRepository;

public class TripOfEmployeeDao {

	@Autowired
	TripOfEmployeeRepository toe;
	
	public TripOfEmployee findOne(Integer idtoe) 
	{
		return toe.findJustOne(idtoe);
		
	}

	
	public TripOfEmployee save(TripOfEmployee t) 
	{
		return toe.save(t);
		
	}
	
	public List<TripOfEmployee> findAll(TripOfEmployee t){
		return toe.findAll();
	}
	
	public void delete (TripOfEmployee t) 
	{
		 toe.delete(t);
		
	}
}

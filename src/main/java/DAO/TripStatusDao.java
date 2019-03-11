package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.TripStatus;
import repo.TripStatusRepository;

public class TripStatusDao {
	
	@Autowired
	TripStatusRepository tRep;
	
	
	public TripStatus finOne(Integer idts) 
	{
		return tRep.findJustOne(idts);
		
	}

	
	public TripStatus save(TripStatus t) 
	{
		return tRep.save(t);
		
	}
	
	public List<TripStatus> findAll(TripStatus t){
		return tRep.findAll();
	}
	
	public void delete (TripStatus t) 
	{
		 tRep.delete(t);
		
	}
	
}

package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Destination;
import repo.DestinationRepository;

public class DestinationDao {
	@Autowired
	DestinationRepository dRep;
	
	public Destination findOne(Integer idd) 
	{
		return dRep.findJustOne(idd);
		
	}

	
	public Destination save(Destination d) 
	{
		return dRep.save(d);
		
	}
	
	public List<Destination> findAll(Destination d){
		return dRep.findAll();
	}
	
	public void delete (Destination d) 
	{
		 dRep.delete(d);
		
	}
	
}

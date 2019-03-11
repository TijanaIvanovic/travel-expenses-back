package DAO;
import java.util.List;
import java.util.Optional;

import Model.DestinationWage;
import repo.DestinationWageRepository;


public class DestinationWageDao {
	DestinationWageRepository dwRep;
	
	public DestinationWage findOne(Integer iddw) 
	{
		return dwRep.findJustOne(iddw);
		
	}

	
	public DestinationWage save(DestinationWage dw) 
	{
		return dwRep.save(dw);
		
	}
	
	public List<DestinationWage> findAll(DestinationWage dw){
		return dwRep.findAll();
	}
	
	public void delete (DestinationWage dw) 
	{
		dwRep.delete(dw);
		
	}
	

}

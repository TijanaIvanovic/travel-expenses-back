package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Wage;
import repo.WageRepository;

public class WageDao {
	
	@Autowired
	WageRepository wRep;
	
	public Wage finOne(Integer idw) 
	{
		return wRep.findJustOne(idw);
		
	}

	
	public Wage save(Wage w) 
	{
		return wRep.save(w);
		
	}
	
	public List<Wage> findAll(Wage w){
		return wRep.findAll();
	}
	
	public void delete (Wage w) 
	{
		wRep.delete(w);
		
	}
	
}

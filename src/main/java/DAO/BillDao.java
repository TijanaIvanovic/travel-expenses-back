package DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import Model.Bill;
import repo.BillRepository;

public class BillDao {
	
	@Autowired
	BillRepository billRep;
	
	
	public Bill save(Bill b) 
	{
		return billRep.save(b);
		
	}
	
	public List<Bill> findAll(Bill b){
		return billRep.findAll();
	}
	
	public void delete (Bill b) 
	{
		 billRep.delete(b);
		
	}
	

	
}

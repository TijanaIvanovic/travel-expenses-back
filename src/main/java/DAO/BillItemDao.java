package DAO;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import Model.BillItem;
import repo.BillItemRepository;

public class BillItemDao {
	
	@Autowired
	BillItemRepository BillItemRep;
	
	@Transactional
	public BillItem findOne(Integer idbi) 
	{
		return BillItemRep.findJustOne(idbi);
		
	}

	
	public BillItem save(BillItem b) 
	{
		return BillItemRep.save(b);
		
	}
	
	public List<BillItem> findAll(BillItem b){
		return BillItemRep.findAll();
	}
	
	public void delete (BillItem b) 
	{
		 BillItemRep.delete(b);
		
	}

}

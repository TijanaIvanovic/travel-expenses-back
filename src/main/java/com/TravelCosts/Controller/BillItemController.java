package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Billitem;
import com.TravelCosts.Service.BillItemService;

@RestController
public class BillItemController {
	
	@Autowired
	BillItemService biService;
	
	@GetMapping(path="billitems")
	public List<Billitem> getAllBillItems(){
		return biService.findAll();
	}
	
	@PostMapping(path="billitem")
	public void createNewBillitem(@RequestBody Billitem bi) {
		biService.createBillItem(bi);
	}

}

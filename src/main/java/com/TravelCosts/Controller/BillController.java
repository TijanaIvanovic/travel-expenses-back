package com.TravelCosts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TravelCosts.Model.Bill;
import com.TravelCosts.Service.BillService;

@RestController
public class BillController {
	
	@Autowired
	BillService bService;
	
	@GetMapping(path="bills")
	public List<Bill> getAllBills(){
		return bService.findAll();
	}
	
	@PostMapping(path="bill")
	public void createNewBill(@RequestBody Bill b) {
		bService.createBill(b);
	}

}

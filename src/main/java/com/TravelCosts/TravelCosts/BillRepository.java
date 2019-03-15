package com.TravelCosts.TravelCosts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface BillRepository extends JpaRepository<Bill, Integer>{

	
	

	
}

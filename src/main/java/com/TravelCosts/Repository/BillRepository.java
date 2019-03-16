package com.TravelCosts.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Bill;


@Component
public interface BillRepository extends JpaRepository<Bill, Integer>{

	
	

	
}

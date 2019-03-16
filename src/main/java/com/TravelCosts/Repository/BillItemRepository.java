package com.TravelCosts.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Billitem;

@Component
public interface BillItemRepository extends JpaRepository<Billitem, Integer>{
 
	 

}
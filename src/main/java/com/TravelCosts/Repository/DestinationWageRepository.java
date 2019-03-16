package com.TravelCosts.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Destinationwage;

@Component
public interface DestinationWageRepository extends JpaRepository<Destinationwage, Integer>{

	
}
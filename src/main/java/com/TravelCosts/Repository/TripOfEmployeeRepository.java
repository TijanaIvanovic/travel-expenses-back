package com.TravelCosts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Tripofemployee;

@Component
public interface TripOfEmployeeRepository extends JpaRepository<Tripofemployee, Integer>{


}

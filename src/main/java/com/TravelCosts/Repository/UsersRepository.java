package com.TravelCosts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.TravelCosts.Model.Users;


@Component
public interface UsersRepository extends JpaRepository<Users, Integer>{
	

}

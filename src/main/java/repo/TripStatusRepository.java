package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import Model.TripStatus;

public interface TripStatusRepository extends JpaRepository<TripStatus, Integer>{
	
	 @Query("SELECT t FROM TripStatus t WHERE b.idts = ?1")
	 TripStatus findJustOne(int idts);

}
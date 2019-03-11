package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.DestinationWage;

public interface DestinationWageRepository extends JpaRepository<DestinationWage, Integer>{

	 @Query("SELECT d FROM DestinationWage d WHERE d.iddw = ?1")
	 DestinationWage findJustOne(int iddw);
	
}
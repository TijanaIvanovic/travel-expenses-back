package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Integer>{

	 @Query("SELECT d FROM Destination d WHERE d.idd = ?1")
	 Destination findJustOne(int idd);
	
}

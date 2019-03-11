package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.BusinessTrip;

public interface BusinessTripRepository extends JpaRepository<BusinessTrip, Integer>{

	 @Query("SELECT b FROM BusinessTrip b WHERE b.idbt = ?1")
	 BusinessTrip findJustOne(int idbt);
	
}

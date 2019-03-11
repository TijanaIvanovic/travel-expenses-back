package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import Model.TripOfEmployee;

public interface TripOfEmployeeRepository extends JpaRepository<TripOfEmployee, Integer>{
	
	 @Query("SELECT t FROM TripOfEmployee t WHERE t.idtoe = ?1")
	 TripOfEmployee findJustOne(int idtoe);

}

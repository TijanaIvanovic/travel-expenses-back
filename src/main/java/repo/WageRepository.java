package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.Wage;

public interface WageRepository extends JpaRepository<Wage, Integer>{
	
	 @Query("SELECT w FROM Wage w WHERE w.idw = ?1")
	 Wage findJustOne(int idw);

}

package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import Model.EmployeeStatus;;

public interface EmployeeStatusRepository extends JpaRepository<EmployeeStatus, Integer>{
	
	 @Query("SELECT e FROM EmployeeStatus e WHERE e.ides = ?1")
	 EmployeeStatus findJustOne(int ides);

}

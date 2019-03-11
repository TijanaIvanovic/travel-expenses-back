package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	 @Query("SELECT e FROM Employee e WHERE e.ide = ?1")
	 Employee findJustOne(int ide);
	
}

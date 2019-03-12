package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}

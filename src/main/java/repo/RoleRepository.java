package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	 @Query("SELECT r FROM Role b WHERE r.idr = ?1")
	 Role findJustOne(int idr);

}

package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	 @Query("SELECT u FROM Users u WHERE u.idu = ?1")
	 Users findJustOne(int idu);

}

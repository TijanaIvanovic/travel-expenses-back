package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Model.BillItem;

public interface BillItemRepository extends JpaRepository<BillItem, Integer>{
	
	 @Query("SELECT b FROM BillItem b WHERE b.idbi = ?1")
	 BillItem findJustOne(int idbi);
	 
	 

}
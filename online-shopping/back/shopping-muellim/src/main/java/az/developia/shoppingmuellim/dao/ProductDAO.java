package az.developia.shoppingmuellim.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.shoppingmuellim.model.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
	// select * from product where username=username
	public List<Product> findAllByUsername(String username);
	
	//select * from product where name like %java% limit 30,20
	@Query(value="select * from product where name like %?1% limit ?2,?3",nativeQuery=true)
	public List<Product> findPartial(String search,Integer begin,Integer length);
	// java, 30, 20
	
	
	
}

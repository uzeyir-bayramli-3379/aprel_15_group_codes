package az.developia.shopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.shopping.model.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
	
	// select * from product where name=n
public List<Product> findAllByName(String n);

@Query(value="select * from product where name like %?1% or price like %?1% or description like %?1%",nativeQuery=true)
// @Query(value="select * from product where name like %?1% or price like %?1% or description like %?1%",nativeQuery=true)
// select * from product where name like %ar% or price like %ar% or description like %ar%
public List<Product> findAllSearch(String search);
}

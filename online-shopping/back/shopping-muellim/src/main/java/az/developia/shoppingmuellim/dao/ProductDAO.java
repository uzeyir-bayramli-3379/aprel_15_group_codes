package az.developia.shoppingmuellim.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.shoppingmuellim.model.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
	// select * from product where username=username
	public List<Product> findAllByUsername(String username);
}

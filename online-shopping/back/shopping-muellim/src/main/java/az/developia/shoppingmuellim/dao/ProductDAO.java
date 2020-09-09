package az.developia.shoppingmuellim.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.shoppingmuellim.model.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {

}

package az.developia.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.shopping.dao.ProductDAO;
import az.developia.shopping.model.Product;

@RestController
@RequestMapping(path="/products")
public class ProductController {
 

	@Autowired
	private ProductDAO productDAO;
	
	@PostMapping
	public void add(@RequestBody Product product){
		product.setId(null);
		productDAO.save(product);
	}
	
	@GetMapping
	public List<Product> findAll(){
return productDAO.findAll();
	}
	
	
	@GetMapping(path="/{id}")
	public  Product  findById(@PathVariable(name="id") Integer id){
return productDAO.findById(id).get();
	}
	
	
}

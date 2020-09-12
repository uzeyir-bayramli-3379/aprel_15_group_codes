package az.developia.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.shopping.dao.ProductDAO;
import az.developia.shopping.model.Product;

@RestController
@RequestMapping(path="/products")
@CrossOrigin(origins = "*")
public class ProductController {
 

	@Autowired
	private ProductDAO productDAO;
	
	@PostMapping
	public void add(@Valid @RequestBody Product product){
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
	
	
	@DeleteMapping(path="/{id}")
	public void delete(@PathVariable(name="id") Integer id){
		productDAO.deleteById(id);
	}
	@PutMapping
	public void update(@RequestBody Product product){
	 
		productDAO.save(product);
	}
	
	@GetMapping(path="/name/{name}")
	public  List<Product>  findAllByName(@PathVariable(name="name") String name){
return productDAO.findAllByName(name);
	}
	
	@GetMapping(path="/search/{search}")
	public  List<Product>  findAllSearch(@PathVariable(name="search") String search){
return productDAO.findAllSearch(search);
	}
	
	
	
	
	
	
	@GetMapping(path="/find-partial/{begin}/{length}")
	public  List<Product>  findAllPartial(@PathVariable(name="begin") Integer begin,@PathVariable(name="length") Integer length){
return productDAO.findAllPartial(begin,length);
	}
	
	
	
	
	
	
	
	
	
}

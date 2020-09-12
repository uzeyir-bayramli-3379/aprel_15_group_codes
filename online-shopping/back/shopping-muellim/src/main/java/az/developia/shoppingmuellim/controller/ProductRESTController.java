package az.developia.shoppingmuellim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.shoppingmuellim.dao.ProductDAO;
import az.developia.shoppingmuellim.model.Product;
import az.developia.shoppingmuellim.model.SearchModel;

@RestController
@RequestMapping(path="/products")
public class ProductRESTController {

	@Autowired
	private ProductDAO productDAO;
	
@GetMapping // http://localhost:8204/products - GET
public List<Product> findAll(){
	return productDAO.findAll();
}
	@PostMapping
	public Integer add(@RequestBody Product product) {
		product.setId(null);
		return productDAO.save(product).getId();
	}
	
	
	@PutMapping
	public void update(@RequestBody Product product) {
		 
		  productDAO.save(product);
	}
	@GetMapping(path="/{id}") // http://localhost:8204/products/4 - GET
	public  Product  findById(@PathVariable(name="id") Integer id){
		return productDAO.findById(id).get();
	}
	
	
	@DeleteMapping(path="/{id}") // http://localhost:8204/products/4 - DELETE
	public  void  deleteById(@PathVariable(name="id") Integer id){
		  productDAO.deleteById(id) ;
	}
	// http://localhost:8204/products/username/ferid - GET
	@GetMapping(path="/username/{username}") 
	public  List<Product>  findAllByUsername(@PathVariable(name="username") String username){
		return productDAO.findAllByUsername(username) ;
	}
	
	
	
	// http://localhost:8204/products/find-partial - POST
		@PostMapping(path="/find-partial")
		public  List<Product>  findPartial(@RequestBody SearchModel searchModel){
			return productDAO.findPartial(searchModel.getSearch(), searchModel.getBegin(), searchModel.getLength());
		}
		
		
	
}

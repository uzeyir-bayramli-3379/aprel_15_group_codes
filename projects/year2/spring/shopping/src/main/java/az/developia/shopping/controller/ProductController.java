package az.developia.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.shopping.model.Product;

@RestController
@RequestMapping(path="/products")
public class ProductController {
@GetMapping
public Product findOne(){
	Product p=new Product();
	p.setId(1);
	p.setName("Apple");
	return p;
}

@GetMapping(path="/find-all")
public List<Product> findMultiple(){
	Product p1=new Product();
	p1.setId(1);
	p1.setName("Apple");
	
	Product p2=new Product();
	p2.setId(2);
	p2.setName("Acer");
	
	List<Product> products=new ArrayList<>();
	products.add(p1);
	products.add(p2);
	
	return products;
}

}

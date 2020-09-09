package az.developia.shoppingmuellim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.shoppingmuellim.dao.ProductDAO;
import az.developia.shoppingmuellim.model.Product;

@RestController
@RequestMapping(path="/products")
public class ProductRESTController {

	@Autowired
	private ProductDAO productDAO;
	
@GetMapping // http://localhost:8204/products - GET
public List<Product> findAll(){
	return productDAO.findAll();
}
	
}

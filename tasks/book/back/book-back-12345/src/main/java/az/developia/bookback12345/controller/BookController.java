package az.developia.bookback12345.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.bookback12345.dao.BookDAO;
import az.developia.bookback12345.model.Book;

@RestController
@RequestMapping(path="/books")
@CrossOrigin(origins="*")
public class BookController {

	@Autowired
	private BookDAO bookDAO;
	
	@GetMapping
	public List<Book> findAll(){
		return bookDAO.findAll();
	}
	
	@GetMapping(path="/{id}")
	public  Book  findById(@PathVariable(name="id") Integer id){
		return bookDAO.findById(id).get();
	}
	
	@DeleteMapping(path="/{id}")
	public  void  deleteById(@PathVariable(name="id") Integer id){
		  bookDAO.deleteById(id) ;
	}
	
	@PostMapping
	public Integer add(@RequestBody Book book){
		book.setId(null);
		return bookDAO.save(book).getId();
	}
	
	
	@PostMapping
	public void update(@RequestBody Book book){
		  bookDAO.save(book) ;
	}
	
	
	
}

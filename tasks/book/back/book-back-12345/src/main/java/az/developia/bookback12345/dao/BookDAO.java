package az.developia.bookback12345.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.bookback12345.model.Book;

public interface BookDAO extends JpaRepository<Book, Integer>{

}

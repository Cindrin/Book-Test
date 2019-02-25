package controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BookService;
import model.Book;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService bs;
	
	@RequestMapping("/all")
	public Hashtable <String, Book> getAll() {
		return bs.getAll();
	}
	
	@RequestMapping("{id}")
	public Book getBook(@PathVariable("id") String id) {
		return bs.getBook(id);
	}	
}
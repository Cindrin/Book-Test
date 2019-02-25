package service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Book;

@Service
public class BookService {
	Hashtable <String, Book> books = new Hashtable <String, Book>();
	public BookService() {
		Book b = new Book();
		b.setId("12");
		b.setTitle("Warloc of the Magus World");
		b.setTags("Transmigration, Magic, Evolution, Human");
		b.setChapters(1200);
		b.setFinished("Yes");
		books.put("12",b);
		
		b = new Book();
		b.setId("20");
		b.setTitle("Everyone Else is a Returnee");
		b.setTags("Magic, Evolution");
		b.setChapters(353);
		b.setFinished("Yes");
		books.put("20",b);
		
		b = new Book();
		b.setId("23");
		b.setTitle("Kumo Desu ga, Nani ka");
		b.setTags("Reincarnation, Magic, Evolution, Monster");
		b.setChapters(300);
		b.setFinished("Yes");
		books.put("23",b);
	}
	public Book getBook(String id) {
		if (books.containsKey(id))
			return books.get(id);
		else
			return null;		
	}
	public Hashtable <String, Book> getAll() {
		return books;
	}
}

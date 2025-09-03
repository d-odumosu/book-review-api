package com.me.bookreviewapi.book;

import com.me.bookreviewapi.book.BookNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class BookService {
	private final BookRepository repository;

	public BookService(BookRepository repository) {
		this.repository = repository;
	}
	public List<Book> getAllBooks(){
		return repository.findAll();
	}
	public List<Book> getBookByAuthor(String author){
		return repository.findByAuthor(author);
	}
	public List<Book> getBookByTitle(String title){
		return repository.findByTitle(title);
	}
	public List<Book> getBookByGenre(String genre){
		return repository.findByGenre(genre);
	}
	public List<Book> getBookByPublishedYear(int publishedYear){
		return repository.findByPublishedYear(publishedYear);
	}
	public void deleteById(Long id) throws BookNotFoundException {
		if (!repository.existsById(id)) {
			throw new BookNotFoundException("Book cannot be deleted. Not found with id: " + id);
		}
		repository.deleteById(id);
	}
	public Book createBook(Book book){
		return repository.save(book);
	}
	public Book getBookByIsbn(String isbn) throws BookNotFoundException {
		return repository.findByIsbn(isbn)
							.orElseThrow(() -> new BookNotFoundException("Book not found with isbn: " + isbn));
	}
	public Book getBookById(Long id) throws BookNotFoundException {
		return repository.findById(id)
						 .orElseThrow(() -> new BookNotFoundException("Book not found with id: " + id));
						
	}
}

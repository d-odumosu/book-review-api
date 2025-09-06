package com.me.bookreviewapi.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class BookService {
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	public List<Book> getBookByAuthor(String author){
		return bookRepository.findByAuthorIgnoreCase(author);
	}
	public List<Book> getBookByTitle(String title){
		return bookRepository.findByTitleContainingIgnoreCase(title);
	}
	
	public void deleteById(Long id) throws BookNotFoundException {
		if (!bookRepository.existsById(id)) {
			throw new BookNotFoundException("Book cannot be deleted. Not found with id: " + id);
		}
		bookRepository.deleteById(id);
	}
	
	public Book createBook(Book book) {
		if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
			throw new IllegalArgumentException("Book title cannot be empty");
		}
		return bookRepository.save(book);
	}
	
	public Book getBookById(Long id) throws BookNotFoundException {
		return bookRepository.findById(id)
						 .orElseThrow(() -> new BookNotFoundException("Book not found with id: " + id));
						
	}
	public List<Book> getBookByGenre(String genre){
		return bookRepository.findByGenreIgnoreCase(genre);
	}
	
	public List<Book> getBooksByRatingGreaterThan(int rating) {
		if (rating > 5 || rating < 1) {
			throw new IllegalArgumentException("Rating must be between 1 and 5");
		}
		return bookRepository.findByRatingGreaterThan(rating);
	}
}

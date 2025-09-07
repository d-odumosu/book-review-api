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
	
	public void deleteById(Long id)  {
		if (!bookRepository.existsById(id)) {
			throw new BookNotFoundException("Book cannot be deleted. Not found with id: " + id);
		}
		bookRepository.deleteById(id);
	}
	
	public Book createBook(Book book) {
		if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
			throw new BookValidationException("Book title cannot be empty");
		}
		return bookRepository.save(book);
	}
	
	public Book getBookById(Long id) {
		return bookRepository.findById(id)
						 .orElseThrow(() -> new BookNotFoundException("Book not found with id: " + id));
						
	}
	public List<Book> getBookByGenre(String genre){
		return bookRepository.findByGenreIgnoreCase(genre);
	}
	
	public List<Book> getBooksByRating(int rating){
		return bookRepository.findBooksByRating(rating);
	}
	
}

package com.me.bookreviewapi.book;

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

}

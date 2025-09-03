package com.me.bookreviewapi.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
    @GetMapping(path = ("/books") )
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping(path = ("/books/title"))
    public List<Book> getBookByTitle(@RequestParam String title){
        return bookService.getBookByTitle(title);
    }
    @GetMapping(path = ("/books/author/{author}"))
    public List<Book> getBookByAuthor(@PathVariable String author){
        return bookService.getBookByAuthor(author);
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
   //delete by id 
   // find book by id
    
}
    

    
    


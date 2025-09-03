package com.me.bookreviewapi.book;

import org.springframework.web.bind.annotation.DeleteMapping;
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
    // @GetMapping(path = ("/books/{id}") )
    // public Book getBookById(@PathVariable Long id){
    //     try {
    //         return bookService.getBookById(id);
    //     } catch (Exception e) {
    //         throw new bookNotFoundException("Book not found:" + id);
    //     }
    // }
    @GetMapping(path = ("/books/title/"))
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
    // @DeleteMapping("/books/{id}")
    // public void deleteBookById(@PathVariable Long id){
    //     try {
    //         bookService.deleteById(id);
    //     } catch (BookNotFoundException e) {
    //         throw new org.springframework.web.server.ResponseStatusException(
    //             org.springframework.http.HttpStatus.NOT_FOUND, "Book not found", e);
    //     }
    // }
    
}
    

    
    


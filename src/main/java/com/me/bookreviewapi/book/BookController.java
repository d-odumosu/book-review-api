package com.me.bookreviewapi.book;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api")

public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book createdBook = bookService.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(createdBook);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) throws BookNotFoundException {
        bookService.deleteById(id);
        return ResponseEntity.ok("Book deleted successfully");
    }
    
    @GetMapping("/rating")
    public List<Book> getBooksByRating(@RequestParam int rating) {
        return bookService.getBooksByRating(rating);
    }
    
    @GetMapping("/books/title")
    public List<Book> getBookByTitle(@RequestParam String title) {
        List<Book> books = bookService.getBookByTitle(title);
        return books;
    }
    @GetMapping("/books/author")
    public List<Book> getBookByAuthor(@RequestParam String author) {
        List<Book> books = bookService.getBookByAuthor(author);
        return books;

    }
    @GetMapping("/books/genre")
    public List<Book> getBookByGenre(@RequestParam String genre){
        List<Book> books = bookService.getBookByGenre(genre);
        return books;
    }
}
    

    
    


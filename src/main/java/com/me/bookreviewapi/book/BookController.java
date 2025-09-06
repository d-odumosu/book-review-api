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
    
    @GetMapping(path = ("/books") )
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping(path = ("/books/genre/{genre}"))
    public List<Book> getBookByGenre(@PathVariable String genre){
        return bookService.getBookByGenre(genre);
    }

    @GetMapping("/books/title")
    public ResponseEntity<List<Book>> getBookByTitle(@RequestParam String title) {
        List<Book> books = bookService.getBookByTitle(title);
        return ResponseEntity.ok(books); // returns [] if empty
    }

    @GetMapping(path = ("/books/author/{author}"))
    public ResponseEntity<List<Book>> getBookByAuthor(@PathVariable String author){
        List<Book> books = bookService.getBookByAuthor(author);
        return ResponseEntity.ok(books);
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
    public List<Book> getBooksByRatingGreaterThan(@RequestParam int rating) {
        return bookService.getBooksByRatingGreaterThan(rating);
    }
}
    

    
    


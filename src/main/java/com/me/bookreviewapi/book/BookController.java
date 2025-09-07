package com.me.bookreviewapi.book;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api")

public class BookController {

    private final BookRepository bookRepository;
	private final BookService bookService;

	public BookController(BookService bookService, BookRepository bookRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
    }
    
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id)
        .orElseThrow(() -> new BookNotFoundException("Book not found with id: " + id));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@Valid @RequestBody Book book) {
        Book createdBook = bookService.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(createdBook);
    }
    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@Valid @PathVariable Long id, @Valid@RequestBody Book updatedBook){
        Book book = bookService.updateBook(id, updatedBook);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) throws BookNotFoundException {
        bookService.deleteById(id);
        return ResponseEntity.ok("Book deleted successfully");
    }
    
    @GetMapping("/books/author")
    public List<Book> getBookByAuthor(@RequestParam String author) {
        List<Book> books = bookService.getBookByAuthor(author);
        return books;

    }
    
    @GetMapping("/books/title")
    public List<Book> getBookByTitle(@RequestParam String title) {
        List<Book> books = bookService.getBookByTitle(title);
        return books;
    }
    
    @GetMapping("/books/genre")
    public List<Book> getBookByGenre(@RequestParam String genre) {
        List<Book> books = bookService.getBookByGenre(genre);
        return books;
    }

    @GetMapping("/books/rating")
    public List<Book> getBooksByRating(@RequestParam int rating) {
        return bookService.getBooksByRating(rating);
    }
    
    @GetMapping("/books/top5")
    public List<Book> getTop5Books() {
        return bookService.getTop5Books();
    }
    
    @GetMapping("/books/search")
    public ResponseEntity<List<Book>> getBooksByTitleAndAuthor(
            @RequestParam String title,
            @RequestParam String author) {

        List<Book> books = bookService.getBooksByTitleAndAuthor(title, author);

        return ResponseEntity.ok(books);
    }

}
    

    
    


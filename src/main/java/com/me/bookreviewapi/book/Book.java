package com.me.bookreviewapi.book;

import java.time.Year;
import java.util.List;

import com.me.bookreviewapi.comment.Comment;
import com.me.bookreviewapi.review.Review;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private Year publishedYear;
    private String genre;
    private String synopsis;
    private String isbn;

    @OneToMany(mappedBy = "book")
    List<Review> reviews;

    @OneToMany(mappedBy = "book")
    List<Comment> comments;

    
    public Book(String title, String author, Year publishedYear, String genre, String synopsis, String openLibraryId, String isbn){
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.genre = genre;
        this.synopsis = synopsis;
        this.isbn = isbn;
    }
    public Book(){}

    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    
    public Year getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Year publishedYear) {
        this.publishedYear = publishedYear;

    }
    
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre =genre;
    }
    public String getSynopsis(){
        return synopsis;
    }
    public void setSynopsis(String synopsis){
        this.synopsis =synopsis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}

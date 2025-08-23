package com.me.bookreviewapi.model;

import java.time.Year;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private Year publishedYear;
    private String genre;

    public Book(String title, String author, Year publishedYear, String genre){
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.genre = genre;
    }
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
}

package com.me.bookreviewapi.book;
import com.me.bookreviewapi.entity_class.BaseEntity;

import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;

@Entity
public class Book extends BaseEntity {

    private String title;
    private String author;

    @Size(max = 1000)
    private String synopsis;
    private String genre;

    public Book(String title, String author, String synopsis, String genre){
        super();
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.genre = genre;
    }

    public Book(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public String getGenre() {
        return genre;}

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

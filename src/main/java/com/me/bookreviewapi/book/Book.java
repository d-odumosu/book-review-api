package com.me.bookreviewapi.book;
import com.me.bookreviewapi.entity_class.BaseEntity;
import javax.persistence.Entity;

@Entity
public class Book extends BaseEntity {

    private String title;
    private String author;
    private String synopsis;

    public Book(String title, String author, String synopsis){
        super();
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;

    }
    //no args constructor
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
}

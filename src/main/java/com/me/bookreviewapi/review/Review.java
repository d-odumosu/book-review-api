package com.me.bookreviewapi.review;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import com.me.bookreviewapi.book.Book;
import com.me.bookreviewapi.model_interface.BaseEntity;
import com.me.bookreviewapi.user.User;


@Entity
public class Review extends BaseEntity {

    @Size(max = 2000)
    private String content;
    @Min(1)
    @Max(5)
    private int rating;

    @ManyToOne(optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public
    Review() {}

    public Review(String content, int rating) {
        super();
        this.content = content;
        this.rating = rating;
    }
   
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

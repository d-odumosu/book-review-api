package com.me.bookreviewapi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "reviews")
public class Review extends Feedback {
    private int rating;

    @ManyToOne
    private User user;
    @ManyToOne 
    private Book book;

    public Review(String content, LocalDateTime createdAt, int rating) {
        super(content, createdAt);
        this.rating = rating;
    }

    public Review() {
        super(null, null);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

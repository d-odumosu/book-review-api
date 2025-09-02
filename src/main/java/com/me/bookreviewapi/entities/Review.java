package com.me.bookreviewapi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review extends Feedback {
    private int rating;

    @OneToMany
    private User user;

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

package com.me.bookreviewapi.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
@Table(name = "reviews")
public class Review extends Feedback {

    @ManyToOne
    private User user;
    
    @ManyToOne 
    private Book book;

    @OneToMany(mappedBy = "review")
    List<Comment> comment;

    public Review(String content, LocalDateTime createdAt) {
        super(content, createdAt);
    }

    public Review() {
        super(null, null);
    }
}

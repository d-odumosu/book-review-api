package com.me.bookreviewapi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "comments")
public class Comment extends Feedback {

    @ManyToOne
    private User user;

    public Comment(String content, LocalDateTime createdAt) {
        super(content, createdAt);
    }
    public Comment() {
        super(null, null);
        this.user = null;
    }
}
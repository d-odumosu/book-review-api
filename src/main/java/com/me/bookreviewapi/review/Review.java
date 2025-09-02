package com.me.bookreviewapi.review;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

import com.me.bookreviewapi.book.Book;
import com.me.bookreviewapi.comment.Comment;
import com.me.bookreviewapi.interfaceimp.Feedback;
import com.me.bookreviewapi.user.User;

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

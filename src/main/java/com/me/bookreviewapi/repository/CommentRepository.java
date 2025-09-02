package com.me.bookreviewapi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.bookreviewapi.entities.Comment;
import com.me.bookreviewapi.entities.User;
import com.me.bookreviewapi.entities.Book;
import com.me.bookreviewapi.entities.Review;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findByUser(User user);
    List<Comment> findByBook(Book book);
    List<Comment> findByReview(Review review);
} 

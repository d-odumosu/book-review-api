package com.me.bookreviewapi.comment;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.bookreviewapi.book.Book;
import com.me.bookreviewapi.user.User;
import com.me.bookreviewapi.review.Review;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findByUser(User user);
    List<Comment> findByBook(Book book);
    List<Comment> findByReview(Review review);
} 

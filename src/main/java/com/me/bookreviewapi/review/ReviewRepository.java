package com.me.bookreviewapi.review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.bookreviewapi.book.Book;
import com.me.bookreviewapi.user.User;

public interface ReviewRepository extends JpaRepository<Review, Long>{
    List<Review> findByBook(Book book);
    List<Review> findByUser(User user);

}

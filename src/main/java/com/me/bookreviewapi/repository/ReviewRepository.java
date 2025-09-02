package com.me.bookreviewapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.me.bookreviewapi.entities.Review;
import com.me.bookreviewapi.entities.Book;
import com.me.bookreviewapi.entities.User;

public interface ReviewRepository extends JpaRepository<Review, Long>{
    List<Review> findByBook(Book book);
    List<Review> findByUser(User user);

}

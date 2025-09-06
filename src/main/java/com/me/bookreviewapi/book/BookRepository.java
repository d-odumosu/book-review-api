package com.me.bookreviewapi.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorIgnoreCase(String author);

    List<Book> findByRatingGreaterThan(int rating);

    List<Book> findByTitleContainingIgnoreCase(String keyword);

    List<Book> findByGenreIgnoreCase(String genre);
}
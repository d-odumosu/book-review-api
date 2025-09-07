package com.me.bookreviewapi.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorIgnoreCase(String author);

    @Query("SELECT b FROM Book b WHERE b.rating = :rating")
    List<Book> findBooksByRating(@Param("rating") int rating);


    List<Book> findByTitleContainingIgnoreCase(String keyword);

    List<Book> findByGenreIgnoreCase(String genre);
}
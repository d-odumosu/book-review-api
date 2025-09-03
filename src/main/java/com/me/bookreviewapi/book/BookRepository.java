package com.me.bookreviewapi.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    List<Book> findByPublishedYear(int publishedYear);

    List<Book> findByGenre(String genre);

    Optional<Book> findByIsbn(String isbn);

}
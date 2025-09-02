package com.me.bookreviewapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.bookreviewapi.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
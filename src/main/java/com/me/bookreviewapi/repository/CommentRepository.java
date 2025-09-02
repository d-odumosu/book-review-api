package com.me.bookreviewapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.bookreviewapi.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

    
} 

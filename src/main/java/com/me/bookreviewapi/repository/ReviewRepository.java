package com.me.bookreviewapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.me.bookreviewapi.entities.Review;
public interface ReviewRepository extends JpaRepository<Review, Long>{

}

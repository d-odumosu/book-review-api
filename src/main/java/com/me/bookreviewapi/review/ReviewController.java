package com.me.bookreviewapi.review;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api")
public class ReviewController {

private final ReviewService reviewService;


public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
}

@GetMapping("/books/{book_id}/reviews")
public ResponseEntity<List<Review>> getReviewsByBook(@PathVariable Long book_id) {
    List<Review> reviews = reviewService.getReviewsByBookId(book_id);
    return ResponseEntity.ok(reviews);
}

@GetMapping("/users/{user_id}/reviews")
public ResponseEntity<List<Review>> getMethodName(@PathVariable Long user_id) {
    List<Review> reviews = reviewService.getReviewsByUserId(user_id);
    return ResponseEntity.ok(reviews);
}

    @PostMapping("/reviews")
    public ResponseEntity<Review> createReview(@RequestBody Review review) {

        if (review.getContent() == null || review.getContent().trim().isEmpty()) {
            throw new InvalidReviewContentException("Review content cannot be empty");
        }
        Review savedReview = reviewService.createReview(review);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedReview);
    }
    
    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        reviewService.deleteReviewById(id);
        return ResponseEntity.noContent().build();
    }
}

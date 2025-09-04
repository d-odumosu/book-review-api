package com.me.bookreviewapi.review;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

// @GetMapping("/book/{book_id}/reviews}")
// public List<Review> getReviewsByBook(@PathVariable Long book_id) {
//     return reviewService.
// }

    // Get reviews by user
    // Create a review
    // Delete a review
}

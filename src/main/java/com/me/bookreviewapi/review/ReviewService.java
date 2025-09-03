package com.me.bookreviewapi.review;

import com.me.bookreviewapi.book.BookRepository;
import com.me.bookreviewapi.user.UserRepository;

public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public ReviewService(ReviewRepository repository, BookRepository bookRepository, UserRepository userRepository) {
        this.reviewRepository = repository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    // Get reviews by book ID
    // Get reviews by user ID
    // Create a review
    // Delete a review
    // We fetch Book and User first to ensure they exist before creating a review.

}

package com.me.bookreviewapi.review;

import com.me.bookreviewapi.book.BookRepository;
import com.me.bookreviewapi.book.BookNotFoundException;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public ReviewService(ReviewRepository repository, BookRepository bookRepository) {
        this.reviewRepository = repository;
        this.bookRepository = bookRepository;
    }

    public List<Review> getReviewsByBookId(Long book_id){
        return reviewRepository.findByBookId(book_id);
    }
    public List<Review> getReviewsByUserId(Long user_id){
        return reviewRepository.findByUserId(user_id);
    }

    public Review createReview(Review review) {
        if (bookRepository.existsById(review.getBook().getId())) {
            return reviewRepository.save(review);
        }
        throw new BookNotFoundException("Book not found with id: " +
        review.getBook().getId());
    }

    public void deleteReviewById(Long id) {
        if (reviewRepository.existsById(id)) {
            reviewRepository.deleteById(id);
        } else {
            throw new ReviewNotFoundException("Review not found with id: " + id); 
        }
    }
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id)
            .orElseThrow(() -> new ReviewNotFoundException("Review not found with id: " + id));
    }
    public Review updateReview(Long id, Review review) {
        Review existingReview = getReviewById(id);
        existingReview.setContent(review.getContent());
        existingReview.setRating(review.getRating());
        return reviewRepository.save(existingReview);
    }
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
    

}

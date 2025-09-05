package com.me.bookreviewapi.review;

import com.me.bookreviewapi.book.BookRepository;
import com.me.bookreviewapi.book.BookNotFoundException;
import com.me.bookreviewapi.user.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public ReviewService(ReviewRepository repository, BookRepository bookRepository, UserRepository userRepository) {
        this.reviewRepository = repository;
        this.bookRepository = bookRepository;
    }

    public List<Review> getReviewsByBookId(Long book_id){
        return reviewRepository.findByBookId(book_id);
    }
    public List<Review> getReviewsByUserId(Long user_id){
        return reviewRepository.findByUserId(user_id);
    }

    public Review createReview(Review review) throws BookNotFoundException {
        if (bookRepository.existsById(review.getBook().getId())) {
            return reviewRepository.save(review);
        }
        throw new BookNotFoundException("Book not found with id: " +
        review.getBook().getId());
    }

    public void deleteReviewById(Long id) throws ReviewNotFoundException{
        if (reviewRepository.existsById(id)) {
            reviewRepository.deleteById(id);
        }
        throw new ReviewNotFoundException("Book not found with id: " + id);
    }

}

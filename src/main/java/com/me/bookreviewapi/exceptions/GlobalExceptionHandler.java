package com.me.bookreviewapi.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;

import com.me.bookreviewapi.book.BookNotFoundException;
import com.me.bookreviewapi.book.BookValidationException;
import com.me.bookreviewapi.review.InvalidReviewContentException;
import com.me.bookreviewapi.review.ReviewNotFoundException;
import com.me.bookreviewapi.user.UserNotFoundException;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.HashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException ex,HttpServletRequest request ) {
        ErrorResponse error = ErrorResponseUtil.buildErrorResponse(
                ex,
                HttpStatus.NOT_FOUND,
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleBookNotFound(BookNotFoundException ex, HttpServletRequest request) {
        ErrorResponse error = ErrorResponseUtil.buildErrorResponse(
                ex,
                HttpStatus.NOT_FOUND,
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(ReviewNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleReviewNotFound(ReviewNotFoundException ex, HttpServletRequest request) {
        ErrorResponse error = ErrorResponseUtil.buildErrorResponse(
                ex,
                HttpStatus.NOT_FOUND,
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    @ExceptionHandler(InvalidReviewContentException.class)
    public ResponseEntity<ErrorResponse> handleInvalidReviewContent(InvalidReviewContentException ex, 
            HttpServletRequest request){

        ErrorResponse error = ErrorResponseUtil.buildErrorResponse(
                ex,
                HttpStatus.NOT_ACCEPTABLE,
                request.getRequestURI());     
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(error);
    }
    
    @ExceptionHandler(BookValidationException.class)
    public ResponseEntity<ErrorResponse> handleBookValidation(InvalidReviewContentException ex,
            HttpServletRequest request) {

        ErrorResponse error = ErrorResponseUtil.buildErrorResponse(
                ex,
                HttpStatus.BAD_REQUEST,
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponseUtil.buildErrorResponse(ex, HttpStatus.INTERNAL_SERVER_ERROR,
                        request.getRequestURI()));
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions( MethodArgumentNotValidException ex) {
            Map<String, String> errors = new HashMap<>();
             ex.getBindingResult().getAllErrors().forEach((error) -> {
        String fieldName = ((FieldError) error).getField();
        String errorMessage = error.getDefaultMessage();
        errors.put(fieldName, errorMessage);
    });

    return errors;
}

    }     
     




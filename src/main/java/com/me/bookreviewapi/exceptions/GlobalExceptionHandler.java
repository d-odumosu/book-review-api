package com.me.bookreviewapi.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.me.bookreviewapi.book.BookNotFoundException;
import com.me.bookreviewapi.review.ReviewNotFoundException;
import com.me.bookreviewapi.user.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler({
        BookNotFoundException.class,
        UserNotFoundException.class,
        ReviewNotFoundException.class
    })
public ResponseEntity<Map<String, String>> handleNotFound(RuntimeException ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Resource Not Found");
        errorResponse.put("message", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>> handleRuntimeException(RuntimeException ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Internal Server Error");
        errorResponse.put("message", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

package com.me.bookreviewapi.review;

public class ReviewNotFound extends RuntimeException {

    public ReviewNotFound(String message) {
        super(message);
    }
}

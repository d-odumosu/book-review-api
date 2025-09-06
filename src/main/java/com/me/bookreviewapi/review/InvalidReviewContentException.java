package com.me.bookreviewapi.review;

public class InvalidReviewContentException extends RuntimeException{
    public InvalidReviewContentException(String message){
        super(message);
    }
}

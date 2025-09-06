package com.me.bookreviewapi.book;

public class BookValidationException extends RuntimeException {
public BookValidationException(String message){
    super(message);
}
}

package com.practice.spring_book_task.exceptions;

public class EmptyIsbnException extends RuntimeException{
    public EmptyIsbnException() {
        super("ISBN должен быть пустым");
    }
}

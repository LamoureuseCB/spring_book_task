package com.practice.spring_book_task.exceptions;

public class WithoutIsbnException extends RuntimeException{
    public WithoutIsbnException() {
        super("Книга должна быть без поля ISBN");
    }
}

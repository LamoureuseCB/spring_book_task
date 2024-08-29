package com.practice.spring_book_task.exceptions;

public class WithoutTitleException extends RuntimeException{
    public WithoutTitleException() {
        super("У книги не должно быть названия");
    }
}

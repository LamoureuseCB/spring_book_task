package com.practice.spring_book_task.exceptions;

public class EmptyTitleException extends RuntimeException{
    public EmptyTitleException() {
        super("Название должно быть пустым");
    }
}

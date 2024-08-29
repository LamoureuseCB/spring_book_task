package com.practice.spring_book_task.exceptions;

public class FutureDateException extends RuntimeException {
    public FutureDateException() {
        super("Дата должна быть позже сегодняшнего дня(будущая дата)");
    }
}

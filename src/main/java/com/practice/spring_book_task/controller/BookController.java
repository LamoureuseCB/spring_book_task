package com.practice.spring_book_task.controller;

import com.practice.spring_book_task.exceptions.*;
import com.practice.spring_book_task.model.Book;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/books")


public class BookController {

    List<Book> books = new ArrayList<>();

    @PostMapping(value = "/create-with-future-date")
    public Book createBookWithFutureDate(@RequestBody Book book) {
        if (book.getPublishedDate().isAfter(LocalDate.now())) {
            books.add(book);
        } else {
            throw new FutureDateException();
        }
        return book;
    }

    @PostMapping(value = "/create-with-empty-isbn")
    public Book createBookWithEmptyIsbn(@RequestBody Book book) {
        if (book.getIsbn().isEmpty()) {
            books.add(book);
        } else {
            throw new EmptyIsbnException();
        }
        return book;
    }

    @PostMapping(value = "/create-without-isbn")
    public Book createBookWithIsbn(@RequestBody Book book) {
        Book bookWithoutIsbn = new Book();
        bookWithoutIsbn.setTitle(book.getTitle());
        bookWithoutIsbn.setAuthor(book.getAuthor());
        bookWithoutIsbn.setPublishedDate(book.getPublishedDate());
        books.add(bookWithoutIsbn);
        return bookWithoutIsbn;
    }

    @PostMapping(value = "/create-with-empty-title")
    public Book createBookWithEmptyTitle(@RequestBody Book book) {
        if (book.getTitle().isEmpty()) {
            books.add(book);
        } else {
            throw new EmptyTitleException();
        }
        return book;
    }

    @PostMapping(value = "/create-without-title")
    public Book createBookWithoutTitle(@RequestBody Book book) {
        Book bookWithoutTitle = new Book();
        bookWithoutTitle.setIsbn(book.getIsbn());
        bookWithoutTitle.setAuthor(book.getAuthor());
        bookWithoutTitle.setPublishedDate(book.getPublishedDate());
        books.add(bookWithoutTitle);
        return bookWithoutTitle;
    }

    @PostMapping(value = "/create-book")
    public Book createBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @GetMapping("/book")
    public List<Book> getBooks() {
        return books;
    }
}



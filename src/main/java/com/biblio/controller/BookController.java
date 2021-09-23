package com.biblio.controller;

import com.biblio.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
}

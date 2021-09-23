package com.biblio.controller;

import com.biblio.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
}

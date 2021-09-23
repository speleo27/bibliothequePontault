package com.biblio.controller;

import com.biblio.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;

public class LanguageController {
    private final LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
}

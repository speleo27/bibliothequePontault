package com.biblio.controller;

import com.biblio.service.ParagraphService;
import org.springframework.beans.factory.annotation.Autowired;

public class ParagraphController {
    private final ParagraphService paragraphService;

    @Autowired
    public ParagraphController(ParagraphService paragraphService) {
        this.paragraphService = paragraphService;
    }
}

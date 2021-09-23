package com.biblio.controller;

import com.biblio.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;

public class DescriptionController {
    private final DescriptionService descriptionService;

    @Autowired
    public DescriptionController(DescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }
}

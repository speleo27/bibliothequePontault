package com.biblio.controller;

import com.biblio.service.CopyService;
import org.springframework.beans.factory.annotation.Autowired;

public class CopyController {
    private final CopyService copyService;

    @Autowired
    public CopyController(CopyService copyService) {
        this.copyService = copyService;
    }
}

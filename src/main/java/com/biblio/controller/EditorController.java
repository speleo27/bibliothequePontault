package com.biblio.controller;

import com.biblio.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;

public class EditorController {
    private final EditorService editorService;

    @Autowired
    public EditorController(EditorService editorService) {
        this.editorService = editorService;
    }
}

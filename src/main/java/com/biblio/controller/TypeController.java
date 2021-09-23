package com.biblio.controller;

import com.biblio.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;

public class TypeController {
        private final TypeService typeService;

        @Autowired
        public TypeController(TypeService typeService) {
                this.typeService = typeService;
        }
}

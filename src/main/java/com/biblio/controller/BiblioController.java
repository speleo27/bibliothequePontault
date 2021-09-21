package com.biblio.controller;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BiblioController {
    @GetMapping("/")
    public String getIndexVue(){
        return "index";

    }
}

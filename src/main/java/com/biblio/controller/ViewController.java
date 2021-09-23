package com.biblio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
     @GetMapping
    public String showIndex(Model model){
         return "index";
     }
}

package com.biblio.controller;

import com.biblio.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;

public class RentController {
    private final RentService rentService;

    @Autowired
    public RentController(RentService rentService) {
        this.rentService = rentService;
    }
}

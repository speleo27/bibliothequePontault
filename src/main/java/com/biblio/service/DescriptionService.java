package com.biblio.service;

import com.biblio.repository.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService {
    private final DescriptionRepository descriptionRepository;

    @Autowired
    public DescriptionService(DescriptionRepository descriptionRepository) {
        this.descriptionRepository = descriptionRepository;
    }
}

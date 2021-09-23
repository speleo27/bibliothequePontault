package com.biblio.service;

import com.biblio.repository.CopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopyService {
    private final CopyRepository copyRepository;

    @Autowired
    public CopyService(CopyRepository copyRepository) {
        this.copyRepository = copyRepository;
    }
}



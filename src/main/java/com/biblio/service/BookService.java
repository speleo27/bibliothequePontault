package com.biblio.service;

import com.biblio.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
        private final BookRepository bookRepository;

        @Autowired
        public BookService(BookRepository bookRepository) {
                this.bookRepository = bookRepository;
        }
}

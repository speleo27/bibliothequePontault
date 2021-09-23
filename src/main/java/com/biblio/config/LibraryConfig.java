package com.biblio.config;

import com.biblio.model.Library;
import com.biblio.repository.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LibraryConfig {

    @Bean
    CommandLineRunner commandLineRunner(LibraryRepository repository){
        return args -> {
            Library biblio = new Library (
                    "Biblio Pontault-Combault"
            );
            repository.saveAll(List.of(biblio));
        };
    }

}

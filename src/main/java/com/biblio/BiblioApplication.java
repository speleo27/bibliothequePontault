package com.biblio;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.annotation.security.RolesAllowed;
import java.util.Locale;

@Controller

@SpringBootApplication
public class BiblioApplication {

    //@RolesAllowed("*")
    public static void main(String[] args) {
        SpringApplication.run(BiblioApplication.class, args);
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception{
//        System.out.println("hello runner works" );
//    }
//    @Override
//    public void run(String... args) throws Exception{
//        System.out.println("hello runner cmd");
//    }

//    @Bean
//    public LocaleResolver localeResolver(){
//        SessionLocaleResolver slr = new SessionLocaleResolver();
//        slr.setDefaultLocale(Locale.FRANCE);
//        return slr;
//    }
//    @GetMapping(value="/index")
//    public String getIndexVue(){
//        return "index";
//    }
}

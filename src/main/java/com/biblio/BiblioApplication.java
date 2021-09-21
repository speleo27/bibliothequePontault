package com.biblio;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.annotation.security.RolesAllowed;
import java.util.Arrays;
import java.util.Locale;



@SpringBootApplication
public class BiblioApplication {

    //@RolesAllowed("*")
    public static void main(String[] args) {
        SpringApplication.run(BiblioApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("hello sa fonctionne" );
            String[] beanNames =ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }


    @GetMapping(value="/index")
    public String getIndexVue(){
        return "index";
    }
//    @GetMapping(value="thymeleaf")
//    public String getThymeleafVue(){
//        return "index";
//    }
}

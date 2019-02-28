package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception {

        Course course = new Course("Astrophysicas", "Neil D Tyson",
                "Just a course on starts", 3);
        repository.save(course);


        course = new Course("Calculus", "NCarol Henley",
                "Rate of Change of the Rate of Change", 3);
        repository.save(course);


        course = new Course("Freshmen English", "Geraldine Pegram",
                "Learn your language children", 3);
        repository.save(course);

    }
}

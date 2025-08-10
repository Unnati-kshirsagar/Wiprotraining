package com.wipro.lombakdemo;

import com.wipro.lombakdemo.entity.Person;
import com.wipro.lombakdemo.entity.Post;
import com.wipro.lombakdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class LombakDemoApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(LombakDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Sample data: One person, multiple posts
        Person person = Person.builder()
                .name("Unnati Patil")
                .posts(Set.of(
                        Post.builder().message("Hello world!").build(),
                        Post.builder().message("Java + Spring Boot is cool!").build()
                ))
                .build();

        personRepository.save(person);
        System.out.println("✅ Saved person and posts.");
    }
}

package com.wipro.bookmanager;

//this is starting point of your application


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication tells Spring Boot to auto-configure the application.
@SpringBootApplication
public class BookmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmanagerApplication.class, args);
		//SpringApplication.run(...) starts your web app.


	}

}

package com.wipro.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WeatherappApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WeatherappApplication.class, args);
	}
}

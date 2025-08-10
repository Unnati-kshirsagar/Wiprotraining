package com.wipro.weatherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    // Existing endpoint
    @GetMapping("/weather")
    public String getWeather(String city, String day) {
        return "Weather in " + city + " for " + day + " is cloudy.";
    }

    // New endpoint using @PathVariable
    @GetMapping("/tocentigrade/{fahrenheit}")
    public String toCentigrade(@PathVariable double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit + "°F = " + String.format("%.2f", celsius) + "°C";
    }
}

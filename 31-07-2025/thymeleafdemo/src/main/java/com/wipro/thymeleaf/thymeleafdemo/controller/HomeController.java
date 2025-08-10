package com.wipro.thymeleaf.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot + Thymeleaf!");
        return "home"; // Maps to templates/home.html
    }
}

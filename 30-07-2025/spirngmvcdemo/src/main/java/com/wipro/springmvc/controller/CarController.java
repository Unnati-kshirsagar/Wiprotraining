package com.wipro.springmvc.controller;

import com.wipro.springmvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("carList", carService.getCarNames());
        return "carlist";
    }
}
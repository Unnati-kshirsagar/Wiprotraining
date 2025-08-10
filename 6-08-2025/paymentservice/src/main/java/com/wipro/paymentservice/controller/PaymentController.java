package com.wipro.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/pay")
    public String payNow() throws InterruptedException {
        Thread.sleep(300); // Simulate delay
        return "Payment successful!";
    }
}
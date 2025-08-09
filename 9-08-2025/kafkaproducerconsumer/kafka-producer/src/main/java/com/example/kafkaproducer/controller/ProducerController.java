package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.service.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produce")
public class ProducerController {
    private final ProducerService producer;

    public ProducerController(ProducerService producer) {
        this.producer = producer;
    }

    @GetMapping("/{message}")
    public String produce(@PathVariable String message) {
        producer.sendMessage(message);
        return "Sent: " + message;
    }
}

package com.example.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "learn-subject", groupId = "spring-consumer-group")
    public void listen(String message) {
        System.out.println("Spring Boot Consumer received: " + message);
    }
}

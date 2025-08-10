package com.wipro.notificationservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    public String notify(@RequestBody UserNotificationDTO dto) {
        System.out.println("User " + dto.getUsername() + " information is " + dto.getAction());
        return "Notification sent successfully";
    }
}

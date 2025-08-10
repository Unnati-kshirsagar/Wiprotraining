package com.wipro.userservice.dto;

import com.wipro.userservice.entity.User;

public class UserNotificationDTO {
    private User user;
    private String action; // "Created", "Updated", "Deleted"

    // Getters and Setters
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
}

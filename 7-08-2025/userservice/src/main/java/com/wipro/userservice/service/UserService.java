package com.wipro.userservice.service;

import com.wipro.userservice.dto.UserNotificationDTO;
import com.wipro.userservice.entity.User;
import com.wipro.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private RestTemplate restTemplate;

    public User createUser(User user) {
        User saved = repo.save(user);
        notify(saved, "Created");
        return saved;
    }

    public User updateUser(Long id, User user) {
        User existing = repo.findById(id).orElseThrow();
        existing.setUsername(user.getUsername());
        existing.setPassword(user.getPassword());
        existing.setAddress(user.getAddress());
        User updated = repo.save(existing);
        notify(updated, "Updated");
        return updated;
    }

    public void deleteUser(Long id) {
        User user = repo.findById(id).orElseThrow();
        repo.delete(user);
        notify(user, "Deleted");
    }

    public User getUserById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    private void notify(User user, String action) {
        UserNotificationDTO dto = new UserNotificationDTO();
        dto.setUser(user);
        dto.setAction(action);
        restTemplate.postForObject("http://notificationservice/notify", dto, String.class);
    }
}

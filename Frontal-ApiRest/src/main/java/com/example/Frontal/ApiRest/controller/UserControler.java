package com.example.Frontal.ApiRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Frontal.ApiRest.model.User;
import com.example.Frontal.ApiRest.service.UserService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/users")
public class UserControler {
    private final UserService userService;
    
    @Autowired
    public UserControler(UserService userService) {
        this.userService = userService;
    }

    //Implement the Endpoints

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        User existingUser = userService.getUserById(id);
        if (existingUser != null) {
            user.setId(id); // Ensure the correct ID is set
            userService.saveUser(user);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

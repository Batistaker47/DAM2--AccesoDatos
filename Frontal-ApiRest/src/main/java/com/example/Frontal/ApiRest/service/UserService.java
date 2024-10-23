package com.example.Frontal.ApiRest.service;

import java.util.List;
import com.example.Frontal.ApiRest.model.User;

public interface UserService {
	User getUserById(Long id);
    void saveUser(User product);
    void updateUser(User product);
    void deleteUser(Long id);
	List<User> getAllUser();
}

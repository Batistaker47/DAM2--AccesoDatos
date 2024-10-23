package com.example.Frontal.ApiRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Frontal.ApiRest.model.User;
import com.example.Frontal.ApiRest.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}

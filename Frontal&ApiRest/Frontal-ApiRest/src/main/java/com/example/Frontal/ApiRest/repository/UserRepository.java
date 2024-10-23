package com.example.Frontal.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Frontal.ApiRest.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}

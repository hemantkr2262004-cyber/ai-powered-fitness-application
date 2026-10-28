package com.fitness.UserService.service;

import com.fitness.UserService.controller.RegisterRequest;
import com.fitness.UserService.controller.UserResponse;
import com.fitness.UserService.model.user;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse register(RegisterRequest request) {
        user user = new user();

        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        return new UserResponse();
    }
}
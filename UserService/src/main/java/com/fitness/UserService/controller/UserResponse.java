package com.fitness.UserService.controller;

import com.fitness.UserService.model.UserRole;


import java.time.LocalDateTime;

public class UserResponse {
    private String id;
    private String email;
    private String password;
    private String  firstName;
    private String  lastName;
    private UserRole role = UserRole.USER ;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

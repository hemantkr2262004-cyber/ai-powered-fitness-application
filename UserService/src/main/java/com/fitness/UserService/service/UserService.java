package com.fitness.UserService.service;

import com.fitness.UserService.controller.RegisterRequest;
import com.fitness.UserService.controller.UserResponse;
import com.fitness.UserService.model.user;
import com.fitness.UserService.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//   @Autowired
//   private UserRepository repository;
//    public UserResponse register(RegisterRequest request) {
//        user user = new user();
//
//        user.setEmail(request.getEmail());
//        user.setPassword(request.getPassword());
//        user.setFirstName(request.getFirstName());
//        user.setLastName(request.getLastName());
//
//      User savedUser = repository.save(user);
//       UserResponse userResponse = new  UserResponse();
//
//       userResponse.setId(savedUser.getId());
//      userResponse.setPassword(savedUser.getId());
//
//     userResponse.setEmail();

//        userResponse.setFirstName();
//        userResponse.setLastName();
//        userResponse.setLastName();
//
//        userResponse.setCreatedAt();
//        userResponse.setUpadateAt();
//
//
//        return userRespone;
//

  //  }
//}


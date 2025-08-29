package com.drl.jwtspringsecurity.controllers;

import com.drl.jwtspringsecurity.dtos.SignupRequest;
import com.drl.jwtspringsecurity.dtos.UserDTO;
import com.drl.jwtspringsecurity.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupUserController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody SignupRequest signupRequest) {
        UserDTO createdUser = authService.createUser(signupRequest);
        if (createdUser == null) {
            return new ResponseEntity<>("User not created, please try again later!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}

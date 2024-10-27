package com.drl.jwtspringsecurity.controllers;

import com.drl.jwtspringsecurity.dtos.SignupRequest;
import com.drl.jwtspringsecurity.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupUserController {

    @Autowired
    private AuthService authService;

    public ResponseEntity<?> createUser(@ResponseBody SignupRequest signupRequest) {

    }
}

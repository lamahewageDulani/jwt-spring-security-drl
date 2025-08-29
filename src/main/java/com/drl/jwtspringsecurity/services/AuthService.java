package com.drl.jwtspringsecurity.services;

import com.drl.jwtspringsecurity.dtos.SignupRequest;
import com.drl.jwtspringsecurity.dtos.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupRequest signupRequest);
}

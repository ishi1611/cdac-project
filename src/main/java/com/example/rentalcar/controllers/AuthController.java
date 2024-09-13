package com.example.rentalcar.controllers;

import com.example.rentalcar.dtos.LoginRequest;
import com.example.rentalcar.dtos.SignupRequest;
import com.example.rentalcar.entities.User;
import com.example.rentalcar.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.rentalcar.responses.JwtResponse;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        String jwt = authService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
        return ResponseEntity.ok(new JwtResponse(jwt));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signupRequest) {
        User user = authService.registerUser(new User(signupRequest.getUsername(), signupRequest.getEmail(), signupRequest.getPassword()));
        return ResponseEntity.ok(user);
    }
}

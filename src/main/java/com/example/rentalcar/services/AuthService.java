package com.example.rentalcar.services;

import com.example.rentalcar.entities.User;

public interface AuthService {
    String authenticate(String username, String password);
    User registerUser(User user);
}
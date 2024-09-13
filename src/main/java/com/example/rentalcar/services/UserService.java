package com.example.rentalcar.services;

import com.example.rentalcar.entities.User;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
}
package com.example.rentalcar.services;

import com.example.rentalcar.entities.Role;
import com.example.rentalcar.entities.User;
import com.example.rentalcar.enums.ERole;
import com.example.rentalcar.repositories.RoleRepository;
import com.example.rentalcar.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.rentalcar.security.JwtTokenProvider;
import java.util.Optional;
import java.util.Set;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public String authenticate(String username, String password) {
        // Fetch user by username
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Check if user exists and password matches
        if (passwordEncoder.matches(password, user.getPassword())) {
            // Generate JWT token
            return jwtTokenProvider.generateToken(username);
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }

    @Override
    public User registerUser(User user) {
        // Encode the password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Assign roles (assuming you have an ERole enum)
        Role defaultRole = roleRepository.findByName(ERole.ROLE_USER)
                .orElseThrow(() -> new RuntimeException("Role not found"));
        user.setRoles(Set.of(defaultRole));

        // Save the user to the database
        return userRepository.save(user);
    }
}

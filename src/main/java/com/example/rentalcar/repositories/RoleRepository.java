package com.example.rentalcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rentalcar.entities.Role;
import com.example.rentalcar.enums.ERole;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
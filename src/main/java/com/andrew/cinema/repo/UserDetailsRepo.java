package com.andrew.cinema.repo;

import com.andrew.cinema.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
    User findByUsername(String username);
}

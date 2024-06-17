package com.assignment.Makersharks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Makersharks.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

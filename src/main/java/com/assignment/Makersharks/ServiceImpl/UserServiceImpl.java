package com.assignment.Makersharks.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Makersharks.Models.User;
import com.assignment.Makersharks.Repository.UserRepository;
import com.assignment.Makersharks.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean registerUser(User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return false; // User already exists
        }
        userRepository.save(user);
        return true;
    }

    @Override
    public User fetchUser(String username) {
        return userRepository.findByUsername(username);
    }
}

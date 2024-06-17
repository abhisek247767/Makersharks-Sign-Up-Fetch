package com.assignment.Makersharks.Service;

import com.assignment.Makersharks.Models.User;

public interface UserService {
    boolean registerUser(User user);
    User fetchUser(String username);
}
package com.me.bookreviewapi.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
// Create a new user
// Get user by ID
// Get all users
// Delete a user

}



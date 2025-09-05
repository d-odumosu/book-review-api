package com.me.bookreviewapi.user;

import org.springframework.stereotype.Service;

import com.me.bookreviewapi.user.UserNotFoundException;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

public User getUserById(Long id) {
    return userRepository.findById(id)
        		.orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

}
// Delete a user
// Create a new user

}



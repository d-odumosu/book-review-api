package com.me.bookreviewapi.user;

import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

public User getUserById(Long id) throws UserNotFoundException {
    return userRepository.findById(id)
        		.orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

}
public void deleteById(Long id) throws UserNotFoundException {
    if (userRepository.existsById(id)) {
        userRepository.deleteById(id);
    } else {
        throw new UserNotFoundException("User not found with id: " + id);
    }
}
public User createUser(User user){
    return userRepository.save(user);
}

public User getUserByUsername(String username) throws UserNotFoundException {
    return userRepository.findByUsername(username)
            .orElseThrow(() -> new UserNotFoundException("User not found with username: " + username));
}
}



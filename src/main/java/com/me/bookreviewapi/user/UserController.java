package com.me.bookreviewapi.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/users/{id}")
    public User getUserById(@RequestParam Long id) {
        return userService.findById(id);
    }
    @PostMapping("users")
    public String createUser(@RequestBody User user) {
        //TODO: process POST request
        
        return entity;
    }
    
    
    // 3. Create a new user
    // 4. Delete a user

}

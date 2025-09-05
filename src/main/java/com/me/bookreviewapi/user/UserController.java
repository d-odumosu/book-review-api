package com.me.bookreviewapi.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/users/{id}")
    public User getUserById(@RequestParam Long id) {
        return userService.getUserById(id);
    }
    @GetMapping("/users/{username}")
    public User getUserByUsername(@RequestParam String username) {
        return userService.getUserByUsername(username);
    }
    
    @PostMapping("/users")
    public ResponseEntity<User> createUser( @NotBlank @RequestBody User user) {
      User newUser = userService.createUser(user);
      return ResponseEntity.ok(newUser);
    }
    
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}

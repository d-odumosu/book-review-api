package com.me.bookreviewapi.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

import com.me.bookreviewapi.entity_class.BaseEntity;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @NotBlank(message = "Username is mandatory")
    private String username;
    @Email(message = "Email is mandatory")
    private String email;
    @NotBlank(message = "Password is mandatory")
    private String password;

    public User(String username, String email, String password){
        super();
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

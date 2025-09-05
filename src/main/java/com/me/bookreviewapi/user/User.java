package com.me.bookreviewapi.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

import com.me.bookreviewapi.entity_class.BaseEntity;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @NotBlank(message = "Username is mandatory")
    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    @Email(message = "Email is mandatory")
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    public User(String username, String email){
        super();
        this.username = username;
        this.email = email;
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
    
    public Role getRole() {
        return role;
    }
   
}

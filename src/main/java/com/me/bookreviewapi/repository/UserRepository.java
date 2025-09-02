package com.me.bookreviewapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.me.bookreviewapi.entities.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);

    Optional<User> findByEmail(String email);
}

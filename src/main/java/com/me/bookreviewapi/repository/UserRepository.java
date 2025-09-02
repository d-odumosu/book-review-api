package com.me.bookreviewapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.me.bookreviewapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

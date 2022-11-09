package com.example.spring_security.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.spring_security.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(" select u from User u where u.username = ?1")
    Optional<User> findUserWithName(String username);
}

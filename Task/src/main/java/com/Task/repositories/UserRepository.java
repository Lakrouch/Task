package com.Task.repositories;

import com.Task.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
    void deleteUserById(Long id);
}

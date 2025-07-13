package com.gymapp.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymapp.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByName(String username);
    boolean userExists(String username);

}

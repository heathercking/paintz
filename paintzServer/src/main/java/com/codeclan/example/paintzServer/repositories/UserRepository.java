package com.codeclan.example.paintzServer.repositories;

import java.util.Optional;
import com.codeclan.example.paintzServer.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

//
//    Optional<User> findByUsername(String username);
//
//    Boolean existsByUsername(String username);
//
//    Boolean existsByEmail(String email);
}

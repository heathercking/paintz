package com.codeclan.example.paintzServer.configs.security;

import com.codeclan.example.paintzServer.models.user.User;
import com.codeclan.example.paintzServer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    // this is the most basic set-up, if time, need to add more meaningful exceptions (if doesn't find a user)
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);
        return userPrincipal;
    }

}

// we define a user Princpal and map it to an existing User entity (with decorator pattern)

// 1) we need to load the user by username (the above method)
// 2) we have a list of Users stored in the database
// 3) we have a User Repository to extract them by username
// 4) and then they are mapped to the UserPrincipal
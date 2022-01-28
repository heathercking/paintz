//package com.codeclan.example.paintzServer.models.user;
//
//import com.codeclan.example.paintzServer.repositories.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class DbInit implements CommandLineRunner {
//
//    private UserRepository userRepository;
//    private PasswordEncoder passwordEncoder;
//
//    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public void run(String... args) {
//        // Delete all
////        this.userRepository.deleteAll();
//
//        // Crete users
//        User heather = new User("heather@test.com", passwordEncoder.encode("password"));
//        User admin = new User("admin@test.com", passwordEncoder.encode("admin"));
//
//        List<User> users = Arrays.asList(heather, admin);
//
//        // Save to db
//        this.userRepository.saveAll(users);
//    }
//
//}

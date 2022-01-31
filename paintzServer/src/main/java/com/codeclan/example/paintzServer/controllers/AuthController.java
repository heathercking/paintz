//package com.codeclan.example.paintzServer.controllers;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import javax.validation.Valid;
//
////import com.codeclan.example.paintzServer.configs.securityRework.JwtUtils;
////import com.codeclan.example.paintzServer.configs.securityRework.UserDetailsImpl;
//import com.codeclan.example.paintzServer.models.enums.ERole;
////import com.codeclan.example.paintzServer.models.user.Role;
//import com.codeclan.example.paintzServer.models.user.User;
//import com.codeclan.example.paintzServer.repositories.RoleRepository;
//import com.codeclan.example.paintzServer.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////import com.bezkoder.springjwt.models.ERole;
////import com.bezkoder.springjwt.models.Role;
////import com.bezkoder.springjwt.models.User;
////import com.bezkoder.springjwt.payload.request.LoginRequest;
////import com.bezkoder.springjwt.payload.request.SignupRequest;
////import com.bezkoder.springjwt.payload.response.JwtResponse;
////import com.bezkoder.springjwt.payload.response.MessageResponse;
////import com.bezkoder.springjwt.repository.RoleRepository;
////import com.bezkoder.springjwt.repository.UserRepository;
////import com.bezkoder.springjwt.security.jwt.JwtUtils;
////import com.bezkoder.springjwt.security.services.UserDetailsImpl;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    @Autowired
//    PasswordEncoder encoder;
//
//    @Autowired
//    JwtUtils jwtUtils;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
//
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt = jwtUtils.generateJwtToken(authentication);
//
//        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
//        List<String> roles = userDetails.getAuthorities().stream()
//                .map(item -> item.getAuthority())
//                .collect(Collectors.toList());
//
//        return ResponseEntity.ok(new JwtResponse(jwt,
//                userDetails.getId(),
//                userDetails.getUsername(),
//                userDetails.getEmail(),
//                roles));
//    }
//
//}

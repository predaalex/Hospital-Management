package com.cegeka.academy.bepatientshub4.security;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;


    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody UserDTO loginRequest, HttpServletResponse httpServletResponse) {
        int expirationSeconds = 30 * 60;

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtUtils.generateJwtToken(authentication, expirationSeconds);

        Cookie cookie = new Cookie("auth", jwt);
        cookie.setMaxAge(expirationSeconds);
        cookie.setPath("/be-patient");
        httpServletResponse.addCookie(cookie);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        StringBuilder sb = new StringBuilder("User logged in. Token = ");
        sb.append(jwt)
                .append(", id = ")
                .append(userDetails.getId())
                .append(", email = ")
                .append(userDetails.getEmail());

        return ResponseEntity.ok(sb);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO) {

        if (userRepository.existsByEmail(userDTO.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body("Error: Email is already in use!");
        }

        // Create new user's account
        User user = new User(
                userDTO.getEmail(),
                encoder.encode(userDTO.getPassword()));

        userRepository.save(user);

        return ResponseEntity.ok("User registered successfully!");
    }
}
package com.example.auth.controller;

import com.example.auth.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    @Autowired
    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest loginRequest) {
        // Validate username and password (you can add your own authentication logic here)
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        if ("testuser".equals(username) && "password".equals(password)) {  // Example validation
            return jwtUtil.generateToken(username); // Generate and return JWT token
        }

        throw new RuntimeException("Invalid credentials");
    }
}

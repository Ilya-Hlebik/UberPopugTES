package com.popug.controller;

import com.popug.config.JwtUtil;
import com.popug.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final JwtUtil jwtUtil;


    @PostMapping("/login")
    public Mono<ResponseEntity<String>> login(ServerWebExchange swe) {
        return userService.login(swe)
                .map(userDetails -> ResponseEntity.ok(jwtUtil.generateToken(userDetails)))
                .defaultIfEmpty(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }

    @PostMapping("/register")
    public Mono<UserDetails> register(ServerWebExchange swe) {
        return userService.register(swe);
    }
}

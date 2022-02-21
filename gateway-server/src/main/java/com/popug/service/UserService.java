package com.popug.service;

import com.popug.dbo.User;
import com.popug.dbo.UserRole;
import com.popug.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService implements ReactiveUserDetailsService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return userRepository.findByUsername(username)
                .cast(UserDetails.class);
    }


    public Mono<UserDetails> saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user)
                .cast(UserDetails.class);
    }

    public Mono<User> login(ServerWebExchange swe) {
        return swe.getFormData().flatMap(credentials ->
                findByUsername(credentials.getFirst("username"))
                        .cast(User.class)
                        .filter(userDetails -> passwordEncoder
                                .matches(credentials.getFirst("password"), userDetails.getPassword())));
    }

    public Mono<UserDetails> register(ServerWebExchange swe) {
        return swe.getFormData().flatMap(credentials -> findByUsername(credentials.getFirst("username"))
                .flatMap(user -> Mono.error(new RuntimeException()))
                .switchIfEmpty(createUser(credentials)))
                .cast(UserDetails.class);
    }

    private Mono<UserDetails> createUser(MultiValueMap<String, String> credentials) {
        String username = credentials.getFirst("username");
        String password = credentials.getFirst("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(UserRole.ROLE_USER);
        return saveUser(user);
    }
}

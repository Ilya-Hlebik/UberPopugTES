package com.popug.controller;

import com.popug.feign.GateWayServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class TaskController {
    @Autowired
    private GateWayServiceApi gateWayServiceApi;

    @GetMapping("/resource")
    public Mono<String> resource(ServerWebExchange swe) {
        return swe.getPrincipal().map(Principal::getName);
    }
}

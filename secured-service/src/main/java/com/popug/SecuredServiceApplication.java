package com.popug;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SecuredServiceApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SecuredServiceApplication.class, args);
    }


    @GetMapping("/resource")
    public String resource( ) {
        return "test";
    }
}

package com.popug.controller;

import com.popug.service.ProductRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRpcService productRpcService;

    @GetMapping
    public String greeting() {
        return productRpcService.greeting();
    }
}

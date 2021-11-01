package com.popug.service;

import com.popug.impl.ProductRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductRpcService {

    @Autowired
    private ProductRpc productRpc;

    public String greeting() {

        return productRpc.greeting();
    }


}

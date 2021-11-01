package com.popug.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

@AutoJsonRpcServiceImpl
@Service
public class ProductRpcImpl implements ProductRpc {
    @Override
    public String greeting() {
        return "Hello";
    }
}

package com.popug.config;


import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RpcConfig {
    @Bean
    public AutoJsonRpcServiceImplExporter rpcServiceImplExporter() {
        return new AutoJsonRpcServiceImplExporter();

    }
}

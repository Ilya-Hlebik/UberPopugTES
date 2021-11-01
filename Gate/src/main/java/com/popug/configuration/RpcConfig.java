package com.popug.configuration;


import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import com.popug.impl.ProductRpc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@ComponentScan(basePackageClasses={ProductRpc.class})
public class RpcConfig {
    @Bean
    public AutoJsonRpcClientProxyCreator rpcClientProxyCreator(@Value("${rpc.manager.url}") String url){
        AutoJsonRpcClientProxyCreator creator = new AutoJsonRpcClientProxyCreator();
        try {
            creator.setBaseUrl(new URL(url));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        creator.setScanPackage (ProductRpc.class.getPackage (). getName ()); // Сканировать пакет, в котором находится rpc

        return creator;
    }

}

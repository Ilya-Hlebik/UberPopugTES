package com.popug.impl;

import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("rpc/products")
public interface ProductRpc {

    String greeting();
}

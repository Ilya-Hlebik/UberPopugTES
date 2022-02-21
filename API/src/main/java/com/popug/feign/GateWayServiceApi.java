package com.popug.feign;

import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient(name = "gateway-service")
public interface GateWayServiceApi {
}

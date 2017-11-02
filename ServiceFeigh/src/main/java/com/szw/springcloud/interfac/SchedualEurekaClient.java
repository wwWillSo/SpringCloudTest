package com.szw.springcloud.interfac;

import javax.ws.rs.DefaultValue;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client")
public interface SchedualEurekaClient {
	@RequestMapping(value = "/api/public/retrieveMarketdata")
	String retrieveMarketdata(String key);
}

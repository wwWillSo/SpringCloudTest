package com.szw.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarketdataService {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@Value("${eureka.client.name}")
	private String eurekaClientName ;
	
	private final static String prefix = "http://" ;
	
	public String getEurekaClientUrl() {
		String url = prefix + eurekaClientName ;
		
		return url ;
	}

	public String retrieveMarketdata(String key) {
		
		String url = getEurekaClientUrl() + "/api/public/retrieveMarketdata" ;
		
		return restTemplate.getForObject(url + "?key="+key,String.class);
	}

	
}

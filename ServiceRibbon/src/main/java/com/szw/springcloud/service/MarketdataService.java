package com.szw.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarketdataService {
	
	@Autowired
    RestTemplate restTemplate;

	public String retrieveMarketdata(String key) {
		
		 return restTemplate.getForObject("http://eureka-client/api/public/retrieveMarketdata?key="+key,String.class);
	}

	
}

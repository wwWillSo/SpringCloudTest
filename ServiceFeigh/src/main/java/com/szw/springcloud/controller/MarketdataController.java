package com.szw.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szw.springcloud.interfac.SchedualEurekaClient;

@RestController
public class MarketdataController {
	
	@Autowired
	private SchedualEurekaClient schedualEurekaClient ;
	
	@RequestMapping(value = "/api/public/retrieveMarketdata")
	public String sayHi(String key){
		if (null == key)
			key = "" ;
	    return schedualEurekaClient.retrieveMarketdata(key);
	}
}

package com.szw.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szw.springcloud.service.MarketdataService;

@RestController
public class MarketdataController {
	
	@Autowired
	private MarketdataService marketdataService ;
	
	@RequestMapping(value = "/api/public/retrieveMarketdata")
    public String retrieveMarketdata(String key){
        return marketdataService.retrieveMarketdata(key);
    }

}

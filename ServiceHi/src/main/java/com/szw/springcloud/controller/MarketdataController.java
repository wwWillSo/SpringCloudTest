package com.szw.springcloud.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szw.springcloud.bean.Response;
import com.szw.springcloud.entity.RealTimeMarketdata;
import com.szw.springcloud.repository.RealTimeMarketdataRepository;


@Controller
public class MarketdataController {
	
	@Autowired
	private RealTimeMarketdataRepository realTimeMarketdataRepository ;
	
	@RequestMapping("/api/public/retrieveMarketdata")
	@ResponseBody
	public Response retrieveMarketdata(String key) throws InterruptedException {
		
		System.out.println("===============================================" + key + "===========================================");
		
		Response response = new Response() ;
		
		List<RealTimeMarketdata> list = realTimeMarketdataRepository.findAll() ;
		
		List<Map<String, BigDecimal>> priceList = new ArrayList<Map<String, BigDecimal>>() ;
		
		for (RealTimeMarketdata data : list) {
			Map<String, BigDecimal> map = new HashMap<String, BigDecimal>() ;
			map.put(data.getName(), data.getNow()) ;
			priceList.add(map) ;
//			Thread.sleep(5);
		}
		
		response.setCode("("+key+")SUCCESS") ;
		response.setDesc("数据量：" + priceList.size());
		response.setData(priceList);
		
		return response ;
	}
}

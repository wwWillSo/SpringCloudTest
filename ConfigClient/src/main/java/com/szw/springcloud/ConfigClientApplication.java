package com.szw.springcloud;
	
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope		//必须加上此注解才会生效
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;
    
    @Value("${foo2}")
    String foo2;
    
    @RequestMapping(value = "/hi")
    public String hi(String name){
    	if (name.equals("foo")) {
    		return foo ;
    	}
    	if (name.equals("foo2")) {
    		return foo2 ;
    	} else 
    		return foo;
    }
}
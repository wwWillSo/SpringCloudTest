package com.szw.springcloud.interfac.hystric;

import org.springframework.stereotype.Component;

import com.szw.springcloud.interfac.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
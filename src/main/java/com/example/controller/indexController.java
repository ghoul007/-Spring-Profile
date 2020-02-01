package com.example.controller;

import com.example.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class indexController {

    @Autowired
    private ServiceConfig serviceConfig;

    @GetMapping("/")
    public Map<String, Integer> index(){
        Map<String, Integer> details=  new HashMap<>();
        details.put("a",serviceConfig.getA());
        details.put("b",serviceConfig.getB());
        return details;
    }
}

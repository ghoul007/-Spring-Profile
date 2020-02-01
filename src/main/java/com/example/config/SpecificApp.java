package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;

public class SpecificApp {

    final private ServiceConfig serviceConfig;

    @Autowired
    SpecificApp(ServiceConfig serviceConfig){
        this.serviceConfig =  serviceConfig;

        System.out.println(this.serviceConfig.getA());

    }
}

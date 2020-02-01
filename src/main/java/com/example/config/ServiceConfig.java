package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix= "service-config")
public class ServiceConfig {
    private Integer a;
    private Integer b;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "setConfig{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

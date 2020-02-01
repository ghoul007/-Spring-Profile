package com.example.ghoul.impl;

import com.example.ghoul.GenericService;
import org.springframework.context.annotation.Profile;

@Profile("prod")
public class prodService implements GenericService {
    @Override
    public void setup() {
        System.out.println("Setting up dataSource for PRODUCTION environment. ");
    }
}

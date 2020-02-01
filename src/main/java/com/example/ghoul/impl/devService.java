package com.example.ghoul.impl;

import com.example.ghoul.GenericService;
import org.springframework.context.annotation.Profile;

@Profile("dev")
public class devService implements GenericService {
    @Override
    public void setup() {
        System.out.println("Setting up dataSource for DEVELOPMENT environment. ");
    }
}

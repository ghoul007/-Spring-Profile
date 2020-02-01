package com.example.runner;

import com.example.ghoul.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    private GenericService service;

    @Override
    public void run(String... args) throws Exception {
        service.setup();
    }


}

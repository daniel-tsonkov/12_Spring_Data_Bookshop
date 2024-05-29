package com.example.demo;

import com.example.demo.services.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {
    private SeedService seedService;

    @Autowired
    public ConsoleRunner(SeedService seedService) {
        this.seedService = seedService;
    }
    @Override
    public void run(String... args) throws Exception {
        //System.out.println("Starting....");
        this.seedService.seedAuthors();
        //до 59:57
    }
}

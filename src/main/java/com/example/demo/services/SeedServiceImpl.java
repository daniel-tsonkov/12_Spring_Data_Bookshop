package com.example.demo.services;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class SeedServiceImpl implements SeedService {
    private static final String RESOURCE_PATH = "";
    private static final String AUTHORS_FILE_PATH = RESOURCE_PATH + "";

    @Override
    public void seedAuthors() {
        Files.readAllLines(Path.of(AUTHORS_FILE_PATH))
                .stream()
    }

    @Override
    public void seedCategories() {

    }

    @Override
    public void seedBooks() {

    }
}

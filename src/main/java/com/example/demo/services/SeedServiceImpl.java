package com.example.demo.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SeedServiceImpl implements SeedService {
    private static final String RESOURCE_PATH = "resources/files";
    private static final String AUTHORS_FILE_PATH = RESOURCE_PATH + "authors.txt";

    @Override
    public void seedAuthors() throws IOException {
        Files.readAllLines(Path.of(AUTHORS_FILE_PATH))
                .stream()
                .forEach(System.out::println);
    }

    @Override
    public void seedCategories() {

    }

    @Override
    public void seedBooks() {

    }
}

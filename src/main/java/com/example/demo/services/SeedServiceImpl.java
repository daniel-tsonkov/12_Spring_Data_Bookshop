package com.example.demo.services;

import com.example.demo.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class SeedServiceImpl implements SeedService {
    private static final String RESOURCE_PATH = "src/main/resources/files";
    private static final String AUTHORS_FILE_PATH = RESOURCE_PATH + "/authors.txt";

    @Autowired
    private AuthorRepository //до 1:30:00

    @Override
    public void seedAuthors() throws IOException {
        Files.readAllLines(Path.of(AUTHORS_FILE_PATH))
                .stream()
                .filter(s -> !s.isBlank())
                .map(s -> s.split(" "))
                .map(names -> new Author(names[0], names[1]))
                .forEach(authorRepository::save);
    }

    @Override
    public void seedCategories() {

    }

    @Override
    public void seedBooks() {

    }
}

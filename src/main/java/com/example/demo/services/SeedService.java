package com.example.demo.services;

import java.io.IOException;

public interface SeedService {
    void seedAuthors() throws IOException;
    void seedCategories();
    void seedBooks();
    default void seedAll() throws IOException {
        seedAuthors();
        seedCategories();
        seedBooks();
    };
}

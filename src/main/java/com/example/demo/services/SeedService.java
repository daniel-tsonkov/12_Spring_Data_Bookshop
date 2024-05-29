package com.example.demo.services;

public interface SeedService {
    void seedAuthors();
    void seedCategories();
    void seedBooks();
    default void seedAll() {
        seedAuthors();
        seedCategories();
        seedBooks();
    };
}

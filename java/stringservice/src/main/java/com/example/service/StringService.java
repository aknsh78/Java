package com.example.stringservice.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
        System.out.println("hello");
    }
    
    public String toUpper(String input) {
        return input.toUpperCase();
    }

    public String toLower(String input) {
        return input.toLowerCase();
    }

    public int countCharacters(String input) {
        return input.length();
    }
}
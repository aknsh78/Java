package com.example.stringservice.controller;

import com.example.stringservice.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/string")
public class StringController {

    @Autowired
    private StringService service;

    @PostMapping("/reverse")
    public String reverse(@RequestBody String input) {
        return service.reverse(input);
    }

    @PostMapping("/uppercase")
    public String uppercase(@RequestBody String input) {
        return service.toUpper(input);
    }

    @PostMapping("/lowercase")
    public String lowercase(@RequestBody String input) {
        return service.toLower(input);
    }

    @PostMapping("/count")
    public int count(@RequestBody String input) {
        return service.countCharacters(input);
    }
}

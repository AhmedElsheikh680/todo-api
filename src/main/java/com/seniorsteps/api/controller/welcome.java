package com.seniorsteps.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class welcome {
    @GetMapping("/welcome")
    public String welcome(@RequestParam String name){
        return "Hello Todo "+name;
    }
}

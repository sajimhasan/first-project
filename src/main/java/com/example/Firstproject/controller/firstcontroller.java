package com.example.Firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstcontroller {
    @GetMapping("/helthcheck")
    public String helthcheck(){
        return "Helthcheck";
    }
}

package com.example.Firstproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloworldcontroller {

    @GetMapping("/mastag")

    public String helloworld(){
        return "hello world";
    }
}

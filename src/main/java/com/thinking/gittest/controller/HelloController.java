package com.thinking.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/index")
    public String sayHello(){
        return "Hi, Thinking ~";
    }
}

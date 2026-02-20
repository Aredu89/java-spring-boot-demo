package com.springboot.demo.SpringDemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    //Expose a "/" endpoint that returns "Hello World"
    @Value("${team.name}")
    String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World" + " - " + teamName;
    }
}

package com.springboot.demo.SpringDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    //Expose a "/" endpoint that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}

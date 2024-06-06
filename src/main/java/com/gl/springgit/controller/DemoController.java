package com.gl.springgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hellos")
    public String sayHello(){
        System.out.println("Hello From Java");
        System.out.println("hello from spring");
        return "Hello from spring boot";
    }

}

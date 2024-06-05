package com.gl.springgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hellos")
    public String sayHello(){
        return "Hello from spring boot";
    }

}

package com.myproject.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sample")
public class SampleController {
    @GetMapping("/func1")
    public String sample1() {
        return "Hello World";
    }
    @GetMapping("/func2")
    public String sample2() {
        return "Good Night World";
    }
}

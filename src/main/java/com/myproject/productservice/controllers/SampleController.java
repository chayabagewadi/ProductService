package com.myproject.productservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sample")
public class SampleController {
    @GetMapping("/func1")
    public String sample1() {
        return "Hello World";
    }


    @GetMapping("/func2/{name}")
    public String sample2(@PathVariable String name) {
        return "Good Night " + name;
    }
    @GetMapping("/func3/{name}/")
    public String sample3( @RequestParam("x") int x, @PathVariable String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            sb.append(name).append(" ");
        }
        return sb.toString();
    }
}

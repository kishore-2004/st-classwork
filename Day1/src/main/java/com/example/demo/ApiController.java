package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private String studentName="Purple";
    @GetMapping("/")
    public String getName()
    {
        return "My favorite color is " + studentName;
    }
    
}
package com.example.springbootawsdeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller   // Change from @RestController to @Controller for HTML
@RequestMapping("/demo")
public class TestController {

    @GetMapping("/data")
    public String getData() {
        return "First message from AWS Ecs";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Second message from AWS Ecs";
    }

    @GetMapping("/")   // <-- Add this for root
    public String home() {
        return "index";   // templates/index.html serve karega
    }
}

package com.example.springboot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String home(Model model) {

        System.out.println("Controller executed!");
        model.addAttribute("message", "Hello, World!");
        return "index"; // returns the index.html Thymeleaf template
    }
}

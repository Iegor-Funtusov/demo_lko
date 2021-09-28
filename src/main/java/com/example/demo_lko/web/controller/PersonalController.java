package com.example.demo_lko.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personal")
public class PersonalController {

    @GetMapping
    public String main() {
        return "page/personal/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "page/personal/dashboard";
    }
}

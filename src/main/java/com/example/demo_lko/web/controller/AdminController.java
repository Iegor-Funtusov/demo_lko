package com.example.demo_lko.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Iehor Funtusov, created 31/12/2020 - 10:21 AM
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String main() {
        return "page/admin/dashboard";
    }
}

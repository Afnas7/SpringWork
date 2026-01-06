package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class movie {
    @GetMapping("/mov")
    public String hello(Model model) {

        boolean isLoggedIn = true;
        model.addAttribute("isLoggedIn", isLoggedIn);
        return "film";
    }
}
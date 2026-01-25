package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class homeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/product")
    public String getProduct() {
        return "product";
}
}
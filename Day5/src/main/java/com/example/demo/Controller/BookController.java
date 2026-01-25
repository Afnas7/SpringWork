package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class BookController {

    @GetMapping("/bookhome")
    public String home() {
        return "bookhome";
    }
    @GetMapping("/book")
    public String getProduct() {
        return "books";
}
}
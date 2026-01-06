package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class MusicController {

    @GetMapping("/Music")
    public String hello() {
        return "Welcome";
    }
}

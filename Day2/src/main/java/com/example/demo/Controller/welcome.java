package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class welcome {

	@GetMapping("/start1")
    public String hello() {
        return "redirect:/welcome";
    }
    @GetMapping("/welcome")
    public String home() {
        return "start1";
    }
}

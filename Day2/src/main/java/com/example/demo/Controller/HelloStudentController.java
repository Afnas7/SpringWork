package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class HelloStudentController {

	@GetMapping("/start")
    public String hello() {
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String home() {
        return "start";
    }
}

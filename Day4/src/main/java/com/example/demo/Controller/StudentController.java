package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.Model.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String getStudent(Model model) {
        Product Student = new Product(101,"Anjali Sharma",(float) 92.5);
        model.addAttribute("student", Student);
        return "student";
    }
    @GetMapping("/students")
    public String getProducts(Model model) {
        List<Product> Students = new ArrayList<>();
        Students.add(new Product(101, "Anjali Sharma",(float) 92.5));
        Students.add(new Product(102, "Rohit Mehta",(float) 85.0));
        Students.add(new Product(103, "Sneha lyer",(float) 78.6));
        model.addAttribute("students", Students);
        return "students";
}
}
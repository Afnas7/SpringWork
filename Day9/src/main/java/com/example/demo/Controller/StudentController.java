package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    // View students + Search
    @GetMapping("/")
    public String viewStudents(@RequestParam(required = false) String keyword, Model model) {
        List<Student> students = (keyword != null)
                ? repo.findByNameContainingIgnoreCase(keyword)
                : repo.findAll();

        model.addAttribute("students", students);
        model.addAttribute("keyword", keyword);
        return "phoneindex";
    }

    // Add student page
    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "phoneadd";
    }

    // Save student
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        repo.save(student);
        return "redirect:/";
    }

    // Edit student
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", repo.findById(id).orElse(null));
        return "phoneedit";
    }

    // Delete student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}

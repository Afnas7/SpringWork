package com.example.demo.Controller;

import com.example.demo.Model.Phone;
import com.example.demo.Repository.PhoneRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PhoneController {

    private final PhoneRepository repo;

    public PhoneController(PhoneRepository repo) {
        this.repo = repo;
    }

    // View students + Search
    @GetMapping("/phone")
    public String viewPhone(@RequestParam(required = false) String keyword, Model model) {
        List<Phone> phones = (keyword != null)
                ? repo.findByNameContainingIgnoreCase(keyword)
                : repo.findAll();

        model.addAttribute("phones", phones);
        model.addAttribute("keyword", keyword);
        return "indexphone";
    }

    // Add student page
    @GetMapping("/addphone")
    public String addPhoneForm(Model model) {
        model.addAttribute("phone", new Phone());
        return "addphone";
    }

    // Save student
    @PostMapping("/savephone")
    public String savePhone(@ModelAttribute Phone phone) {
        repo.save(phone);
        return "redirect:/phone";
    }

    // Edit student
    @GetMapping("/editphone/{id}")
    public String editPhone(@PathVariable Long id, Model model) {
        model.addAttribute("phone", repo.findById(id).orElse(null));
        return "editphone";
    }

    // Delete student
    @GetMapping("/deletephone/{id}")
    public String deletePhone(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/phone";
    }
}

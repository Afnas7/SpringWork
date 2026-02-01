package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.LibMember;
import com.example.demo.repository.LibRepository;

@Controller
public class LibController{
	@Autowired
    private LibRepository repository;
	
	@GetMapping("/libregister")
		public String showForm(Model model) {
			model.addAttribute("libMember" , new LibMember());
			return "libregister";
		}
	@PostMapping("/libregister")
		public String register(LibMember libMember,Model model) {
			repository.save(libMember);
			model.addAttribute("name",libMember.getFullName());
			return "success";
	}
}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.JobSeeker;
import com.example.demo.repository.JobRepository;

@Controller
public class JobController{
	 @Autowired
	    private JobRepository repository;
	 
	 @GetMapping("/register")
	 public String showForm(Model model) {
		 model.addAttribute("jobSeeker", new JobSeeker());
		 return "registers";
	 }
	 @PostMapping("/register")
	 public String register(JobSeeker jobSeeker,Model model) {
		 repository.save(jobSeeker);
		 model.addAttribute("name",jobSeeker.getFullName());
		 return "success";
	 }
}
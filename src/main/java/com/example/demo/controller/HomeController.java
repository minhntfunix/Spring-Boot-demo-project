package com.example.demo.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Student;
@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/")
	public String Hello() {
		return "index";
	}
	
	
	@RequestMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "Registration";
	}
	
	
	
}

package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


@Controller
@RequestMapping("/student")
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		
		this.service = service;
	}
	
	
	@RequestMapping("/list")
	public String get(Model model) {
		List<Student> ls= service.findAll();
		model.addAttribute("student",ls);
		return "StudentList";
	}
	
	
	
	@PostMapping("/submit")
	public String submitForm(@Valid @ModelAttribute("student") Student student, 
							BindingResult br)
	{
		if (br.hasErrors()) {
			System.out.println(br);
			return "Registration";
		}else {			
			
			service.save(student);
			System.out.println("Student is created: "+ student);
			
			return "redirect:/student/list";
		}
		
	}
	
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int id) {
		service.delete(id);
		
		return "redirect:/student/list";
	}
	
	@RequestMapping("/showFormUpdate")
	public String save(@RequestParam int id, Model model) {
		Student e= service.find(id);
		model.addAttribute("student", e );
		return "Update";
	}
	
	@RequestMapping("/update")
	public String update(@Valid @ModelAttribute("student") Student student, 
			BindingResult br, @RequestParam int id) {
		if (br.hasErrors()) {
			System.out.println(br);
			return "Update";
		}else {
			student.setId(id);
			service.save(student);
			System.out.println("Student is updated: "+ student);

			return "redirect:/student/list";
		}
	}
	
	
	
	
}
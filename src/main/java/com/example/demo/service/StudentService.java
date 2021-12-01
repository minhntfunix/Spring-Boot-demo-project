package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;



import com.example.demo.model.Student;

@Service
public class StudentService {
	private StudentRepository studentRepository;

	
	
	
	public StudentService(StudentRepository studentRepository) {
		
		this.studentRepository = studentRepository;
	}
	
	
	
	public List<Student> findAll(){
		
		return studentRepository.findAll();
	}
	
	
	


	public Student find(int id) {
		return studentRepository.getById(id);
	}
	
	
	public void save(Student e) {
		studentRepository.save(e);
	}
	
	
	
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	
	
	
}

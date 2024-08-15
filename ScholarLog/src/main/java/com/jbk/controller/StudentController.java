package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;

@GetMapping("/get-all-students")
public List<Student> getAllStudent(){
	 List<Student> list = service.getAllStudent();
	return list;
	
}

@PostMapping("/add-student")
public String addStudent(@RequestBody Student student) {
	String msg = service.addStudent(student);
	return msg;
	
}

@GetMapping("/get-student-by-id/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return null;
	
}
@PutMapping("/update-student")
public Student updateStudent(@RequestBody Student student) {
	return student;
	
}
@DeleteMapping("/delete-student/{id}")
public Student deleteStudentById(@PathVariable Long id) {
	return null;
	
}


}

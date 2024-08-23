package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jbk.entity.Student;
import com.jbk.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/get-all-students")
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    @PostMapping("/add-student")
    public String addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/get-student-by-id/{rollNo}")
    public Student getStudentById(@PathVariable int rollNo) {
        return service.getStudentById(rollNo);
    }

    @PutMapping("/update-student/{rollNo}")
    public Student updateStudent(@PathVariable int rollNo, @RequestBody Student student) {
        return service.updateStudent(rollNo, student);
    }

    @DeleteMapping("/delete-student/{rollNo}")
    public String deleteStudentById(@PathVariable int rollNo) {
        return service.deleteStudentById(rollNo);
    }

}

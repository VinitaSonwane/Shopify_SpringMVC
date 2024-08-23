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
import com.jbk.entity.Subject;
import com.jbk.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @PostMapping("/add-subject")
    public String addSubject(@RequestBody Subject subject) {
        return service.addSubject(subject);
    }

    @GetMapping("/get-all-subjects")
    public List<Subject> getAllSubjects() {
        return service.getAllSubjects();
    }

    @GetMapping("/get-subject-by-id/{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return service.getSubjectById(id);
    }

    @PutMapping("/update-subject")
    public Subject updateSubject(@RequestBody Subject subject) {
        return service.updateSubject(subject);
    }

    @DeleteMapping("/delete-subject/{id}")
    public String deleteSubject(@PathVariable Long id) {
        return service.deleteSubject(id);
    }
}

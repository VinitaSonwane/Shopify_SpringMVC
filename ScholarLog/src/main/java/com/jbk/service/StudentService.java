package com.jbk.service;

import java.util.List;

import com.jbk.controller.Subject;
import com.jbk.entity.Student;

public interface StudentService {
  public String addStudent(Student student);

public List<Student> getAllStudent();

public Student updateStudent(int rollNo, Student student);

public Student deleteStudentById(int rollNo);











}

package com.jbk.service;

import java.util.List;

import com.jbk.entity.Student;
import com.jbk.entity.Subject;

public interface StudentService {
    String addStudent(Student student);
    List<Student> getAllStudent();
    Student updateStudent(int rollNo, Student student);
    String deleteStudentById(int rollNo);
	Student getStudentById(int id);
	Object getAllStudentByRoll(Object rollNos);
	
	
}

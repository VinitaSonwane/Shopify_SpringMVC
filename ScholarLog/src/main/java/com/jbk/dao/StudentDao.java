package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Student;

public interface StudentDao {
	
public String addStudent(Student student);
public List<Student> getAllStudent();
public Student updateStudent(int rollNo, Student student);
public Student deleteStudentById(int rollNo);
Student updateStudent(Long rollNo, Student student);

	

}

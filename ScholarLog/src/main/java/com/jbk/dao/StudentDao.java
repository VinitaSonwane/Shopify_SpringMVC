package com.jbk.dao;

import java.util.List;
import com.jbk.entity.Student;

public interface StudentDao {
    String addStudent(Student student);
    List<Student> getAllStudent();
    Student updateStudent(int rollNo, Student student);
    String deleteStudentById(int rollNo);
	Student getStudentById(int rollNo);
}

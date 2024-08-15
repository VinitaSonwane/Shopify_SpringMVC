package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.StudentDao;
import com.jbk.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;

   @Override
	public String addStudent(Student student) {
	String msg = dao.addStudent(student);
	   return msg;
}

@Override
public List<Student> getAllStudent() {
	List<Student> list = dao.getAllStudent();
	return list;
}
		
	

}

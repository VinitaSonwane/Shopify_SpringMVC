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
        return dao.addStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }

    @Override
    public Student updateStudent(int rollNo, Student student) {
        return dao.updateStudent(rollNo, student);
    }

    @Override
    public String deleteStudentById(int rollNo) {
        return dao.deleteStudentById(rollNo);
    }

    @Override
    public Student getStudentById(int rollNo) {
        return dao.getStudentById(rollNo);  
    }

	@Override
	public Object getAllStudentByRoll(Object rollNos) {
		// TODO Auto-generated method stub
		return null;
	}
}

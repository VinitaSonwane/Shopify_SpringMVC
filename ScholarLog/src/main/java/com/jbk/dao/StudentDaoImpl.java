package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	private List<Student> list = new ArrayList<>();
	@Autowired
	private SessionFactory factory;
	
	
	@Override
	public String addStudent(Student student) {
		Session session = null;
		try {
		session = factory.openSession();
		session.save(student);
		session.beginTransaction().commit();
		return "Data Added";
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		return list;
	}

}

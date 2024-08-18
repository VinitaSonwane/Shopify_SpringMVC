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
	private Object student;
	
	
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
		Session session = null;
		try {
		session = factory.openSession();
		session.save(session);
		session.beginTransaction().commit();
		return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			session.close();
		}
		return list;
	}

	@Override
	public Student updateStudent(int rollNo, Student student) {
		Session session = null;
		try {
		session = factory.openSession();
		session.save(session);
		session.beginTransaction().commit();
		session.update(student);;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			session.close();
		}
		return student;
	}

	@Override
	public Student deleteStudentById(int rollNo) {
		Session session = null;
		try {
			session = factory.openSession();
			session.save(session);
			session.beginTransaction().commit();
			session.delete(student);;
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
			finally {
				session.close();
			}
			return null;
	}

	@Override
	public Student updateStudent(Long rollNo, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.jbk.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jbk.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public String addStudent(Student student) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            return "Data Added";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to add data";
        }
    }

    @Override
    public List<Student> getAllStudent() {
        try (Session session = factory.openSession()) {
            return session.createQuery("from Student", Student.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Student updateStudent(int rollNo, Student student) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Student getStudentById(int rollNo) {
        try (Session session = factory.openSession()) {
            return session.get(Student.class, rollNo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String deleteStudentById(int rollNo) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, rollNo);
            if (student != null) {
                session.delete(student);
                session.getTransaction().commit();
                return "deleted...";
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
}

package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Subject;

@Repository
public class SubjectDaoImpl implements SubjectDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public String addSubject(Subject subject) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(subject);
            session.getTransaction().commit();
            return "Subject Added";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to add subject";
        }
    }

    @Override
    public List<Subject> getAllSubjects() {
        try (Session session = factory.openSession()) {
            return session.createQuery("from Subject", Subject.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Subject getSubjectById(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(Subject.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public Subject updateSubject(Subject subject) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.update(subject);
            session.getTransaction().commit();
            return subject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




    @Override
    public String deleteSubject(Long id) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            Subject subject = session.get(Subject.class, id);
            if (subject != null) {
                session.delete(subject);
                session.getTransaction().commit();
                return "Subject Deleted";
            } else {
                return "Subject not found";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to delete subject";
        }
    }
}

package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory factory;
	

    @Override
    public String addUser(User user) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            return "User added successfully"; 
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to add user"; 
        }
    }

    @Override
	public List<User> getAllUsers() {
		try (Session session = factory.openSession()) {
            return session.createQuery("from User", User.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User getUserByUsername(String username) {
        try (Session session = factory.openSession()) {
            return session.createQuery("from User where username = :username", User.class)
                          .setParameter("username", username)
                          .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public User updateUser(User user) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String deleteUser(String username) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            User user = session.createQuery("from User where username = :username", User.class)
                               .setParameter("username", username)
                               .uniqueResult();
            if (user != null) {
                session.delete(user);
                session.getTransaction().commit();
                return "User deleted successfully";
            } else {
                return "User not found";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to delete user";
        }
    }



	
	}


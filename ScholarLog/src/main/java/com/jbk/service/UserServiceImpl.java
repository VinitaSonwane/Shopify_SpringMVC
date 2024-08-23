package com.jbk.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jbk.dao.UserDao;
import com.jbk.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public String addUser(User user) {
        return dao.addUser(user);
    }

    @Override
	public List<User> getAllUser() {
		 return dao.getAllUsers();
	}

    @Override
    public User getUserByUsername(String username) {
        return dao.getUserByUsername(username);
    }

    @Override
    public User updateUser(User user) {
        return dao.updateUser(user);
    }

    @Override
    public String deleteUser(String username) {
        return dao.deleteUser(username);
    }

	
}

package com.jbk.dao;

import java.util.List;
import com.jbk.entity.User;

public interface UserDao {
    
    List<User> getAllUsers();

    String addUser(User user);

    User getUserByUsername(String username);

    User updateUser(User user);

    String deleteUser(String username);
}

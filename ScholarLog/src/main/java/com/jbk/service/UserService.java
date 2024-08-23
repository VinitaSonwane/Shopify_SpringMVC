package com.jbk.service;

import java.util.List;
import com.jbk.entity.User;

public interface UserService {
    List<User> getAllUser();
    String addUser(User user);
    User getUserByUsername(String username);
    User updateUser(User user);
    String deleteUser(String username);
}

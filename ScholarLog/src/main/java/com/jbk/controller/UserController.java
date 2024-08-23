package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.User;
import com.jbk.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;
    
    @PostMapping("/add-user")
    public String addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/get-all-users")
    public List<User> getAllUsers() {
        return service.getAllUser();
    }

    

    @GetMapping("/get-user-by-username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return service.getUserByUsername(username);
    }

    @PutMapping("/update-user/{lastName}")
    public User updateUser(@PathVariable String lastName, @RequestBody User user) {
        return service.updateUser(user);
    }


    @DeleteMapping("/delete-user/{username}")
    public String deleteUser(@PathVariable String username) {
        return service.deleteUser(username);
    }
}

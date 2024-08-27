package com.jbk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbk.model.LoginRequest;


@Controller
 
public class AuthController {
	
	@PostMapping("/login-user")
		public String loginProcess(@ModelAttribute LoginRequest loginData) {
		System.out.println(loginData);
			return "home";
		}
	}


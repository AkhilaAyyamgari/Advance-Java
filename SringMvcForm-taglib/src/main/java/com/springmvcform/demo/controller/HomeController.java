package com.springmvcform.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvcfrom.demo.model.User;



@Controller
public class HomeController {
@RequestMapping("/home")
public String home() {
	System.out.println("I am in controller method");
	return "home";
}
@RequestMapping("/login")
public String login(Model model) {
	model.addAttribute("user", new User());
	System.out.println("Login method called");
	return "login";
}
@PostMapping("/authenticate")
public String authenticate(@ModelAttribute("user") User user) {
	String username = user.getUsername();
	String password = user.getPassword();
	String ui="";
	if(username.contentEquals("Akhila")&& password.contentEquals("Raghu"))
	{
		ui="success";
		}else {
			ui="failure";
		}
	System.out.println("Authenticate method called");
	return ui;
}
}


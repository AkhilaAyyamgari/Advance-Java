package com.springmvcform.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/home")
public String home() {
	System.out.println("I am in controller method");
	return "home";
}
@RequestMapping("/login")
public String login() {
	System.out.println("Login method called");
	return "login";
}
@PostMapping("/authenticate")
public String authenticate(HttpServletRequest request) {
	String username = request.getParameter("username");
	String password = request.getParameter("password");
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

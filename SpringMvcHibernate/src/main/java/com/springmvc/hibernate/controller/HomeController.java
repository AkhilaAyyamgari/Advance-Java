package com.springmvc.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.hibernate.model.Product;

@Controller
public class HomeController {
@RequestMapping("/home")
public String home() {
	System.out.println("I am in controller method");
	return "home";
}
@RequestMapping("/login")
public String login(Model model) {
	model.addAttribute("product", new Product());
	System.out.println("Login method called");
	return "login";
}
@PostMapping("/authenticate")
public String authenticate(@ModelAttribute("product") Product product) {
	String username = product.getUsername();
	String password = product.getPassword();
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



package com.SpringMvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
@RequestMapping("/home")	
public String home() {
	System.out.println("I am in Controller method");
	return"home";
}
@RequestMapping("/login")
public String login() {
	System.out.println("I am in Login method");
	return"login";
}
}

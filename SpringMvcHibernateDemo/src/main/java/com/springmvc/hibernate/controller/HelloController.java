package com.springmvc.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.hibernate.model.*;
import com.springmvc.hibernate.service.MovieService;

@Controller
public class HelloController {
	@Autowired
	private MovieService movieService;
	
	
    @RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Am in controller method");
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "home";
	}
 @PostMapping("/addMovie")
 public String addMovie(@ModelAttribute Movie movie) {
	 System.out.println("Inside Add Movie");
	 System.out.println(movie);
	 System.out.println("In Controller Method");
	 boolean response = movieService.add(movie);
	 System.out.println("response: " + response);
	 if(response == true) {
		System.out.println("Movie added succesfully"); 
	 }else {
		 System.out.println("Failure!!! Movie not added");
	 }
	 return "home";
 }
 @PostMapping("/updateMovie") 
 public String updateMovie(@ModelAttribute Movie movie) {
     System.out.println("Inside Update Method");
     movieService.update(movie);
	 return "home";
 }
 @PostMapping("/deleteMovie")
 public String deleteMovie(@ModelAttribute Movie movie) {
	 movie.setId(4);
	 movie.setName("Akhila");
	 movie.setReleaseDate("15May");
	 movie.setBudget(987654322);
	 movieService.delete(movie);
	 
     return "home";	 
 }
 @PostMapping("/getAllMovies")
 public String getAllMovies(@ModelAttribute Movie movie) {
	 movieService.getAllMovies(movie);
	 return "home";
 }
 
@RequestMapping("/login")
public String login() {
	System.out.println("login method called");
	return "login";
}

	
}

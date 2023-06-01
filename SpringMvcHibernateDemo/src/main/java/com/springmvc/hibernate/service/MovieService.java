package com.springmvc.hibernate.service;

import com.springmvc.hibernate.model.Movie;

public interface MovieService {

	public boolean add(Movie movie);
	public boolean update(Movie movie);
	public boolean delete(Movie movie);
	public boolean getAllMovies(Movie movie);
	
}

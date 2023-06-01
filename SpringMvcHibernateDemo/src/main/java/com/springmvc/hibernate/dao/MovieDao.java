package com.springmvc.hibernate.dao;

import com.springmvc.hibernate.model.Movie;

public interface MovieDao {

	public boolean add(Movie movie);
	public boolean update(Movie movie);
	public boolean delete(Movie movie);
	public boolean getAllMovies(Movie movie);
}

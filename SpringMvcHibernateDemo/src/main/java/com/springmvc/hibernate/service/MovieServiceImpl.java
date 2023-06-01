package com.springmvc.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.hibernate.dao.MovieDao;
import com.springmvc.hibernate.model.Movie;
@Service
public class MovieServiceImpl implements MovieService {

	
	@Autowired 
	private MovieDao movieDao;
	
	@Transactional
	public boolean add(Movie movie) {
		System.out.println("In Service method");
		return movieDao.add(movie);
	}

	@Override
	public boolean update(Movie movie) {

		return movieDao.update(movie);
	}

	@Override
	public boolean delete(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.delete(movie);
	}

	@Override
	public boolean getAllMovies(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.getAllMovies(movie);
	}

}

package com.springmvc.hibernate.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.hibernate.model.Movie;
@Repository
public class MovieDaoImpl implements MovieDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean add(Movie movie) {
		boolean result = false;
		System.out.println("inside Dao");
		System.out.println("sessionFactory" + sessionFactory);
		Session session = sessionFactory.openSession();
		try {
			Transaction  transaction = session.beginTransaction();
			int i = (int)session.save(movie);
			if(i !=0) {
				result = true;
			}
			transaction.commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}	
			return result;	
	}
	@Override
	public boolean update(Movie movie) {
		boolean result = true;
		System.out.println("sessionFactory" + sessionFactory);
		Session session = sessionFactory.openSession();
		try {
			Transaction  transaction = session.beginTransaction();
			session.update(movie);
			transaction.commit();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	@Override
	public boolean delete(Movie movie) {
		boolean result = true;
		System.out.println("sessionFactory" + sessionFactory);
		Session session = sessionFactory.openSession();
		try {
			Transaction  transaction = session.beginTransaction();
			session.delete(movie);
			transaction.commit();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	@Override
	public boolean getAllMovies(Movie movie) {
		Session session = sessionFactory.openSession();
		Transaction  transaction = session.beginTransaction();
		Query<Movie> query = session.createQuery("from Movie");
	    List<Movie> list = query.list();
	    Iterator<Movie> iterator = list.iterator();
	    while(iterator.hasNext()) {
	    	Movie u1 = iterator.next();
	    	System.out.println(u1.getId() +"\t"+ u1.getName() +"\t"+ u1.getReleaseDate()+"\t"+ u1.getBudget());
	    }
	    transaction.commit();
		return false;
	}
}

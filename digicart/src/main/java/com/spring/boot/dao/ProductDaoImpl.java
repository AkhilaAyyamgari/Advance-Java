package com.spring.boot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.Products;



@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(Products products) {
		boolean result = false;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = (int)session.save(products);
		if(id != 0)
		{
			result = true;
		}
		transaction.commit();
		return result;
	}

	@Override
	public boolean delete(Products products) {
		boolean result = true;
	Session session = sessionFactory.openSession();
	try {
	Transaction transaction = session.beginTransaction();
	session.remove(session.merge(products));
	transaction.commit();
	}catch(Exception e) {
		System.out.println(e);
	}
		return result;
	}

	@Override
	public boolean update(Products products) {
		boolean result = true;
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.update(products);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return result;
	}

	@Override
	public List<Products> findAll() {
		Session session = sessionFactory.openSession();
		List list = session.createQuery("from Products").list();
		return list;
	}

}

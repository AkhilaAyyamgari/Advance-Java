package com.spring.boot.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.Users;

@Repository
public class UserDaoImpl implements UserDao {
	
@Autowired
private SessionFactory sessionFactory;
	@Override
	public boolean add(Users user) {
		boolean result = false;
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	int id = (int )session.save(user);
	if(id != 0)
	{
		result = true;
		}
	transaction.commit();
	return result;
	}
	@Override
	public boolean login(Users user) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean result = false;
		
		String HQLQuery = "select password from User where username=:username";
		Query query = session.createQuery(HQLQuery);
		query.setParameter("username", user.getUsername());
		System.out.println("Object" + query.getSingleResult());
		String pass = (String) query.getSingleResult();
		
		if(user.getPassword().contentEquals(pass)) {
			result = true;
		}
		
		transaction.commit();
		return result;
	}
}


package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.UserDao;
import com.spring.boot.model.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean add(Users user) {
		// TODO Auto-generated method stub
		return userDao.add(user);
	}

	@Override
	public boolean login(Users user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}

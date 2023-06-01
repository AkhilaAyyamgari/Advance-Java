package com.spring.boot.dao;

import com.spring.boot.model.Users;

public interface UserDao {
  
	public boolean add(Users user);
	public boolean login(Users user);
}

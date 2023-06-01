package com.spring.boot.service;

import com.spring.boot.model.Users;

public interface UserService {
	public boolean add(Users user);
	public boolean login(Users user);
}

package com.spring.boot.service;

import java.util.List;

import com.spring.boot.model.Products;

public interface ProductService {

	public boolean add(Products products);
	public boolean delete(Products products);
	public boolean update(Products products);
	public List<Products> findAll();
	
}

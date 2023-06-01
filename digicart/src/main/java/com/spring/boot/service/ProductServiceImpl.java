package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.ProductDao;
import com.spring.boot.model.Products;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public boolean add(Products products) {
		// TODO Auto-generated method stub
		return productDao.add(products);
	}

	@Override
	public boolean delete(Products products) {
		// TODO Auto-generated method stub
		return productDao.delete(products);
	}

	@Override
	public boolean update(Products products) {
		// TODO Auto-generated method stub
		return productDao.update(products);
	}

	@Override
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

}

package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.DAO.ProductDao;
import com.product.DAO.ProductDaoImpl;
import com.product.model.ProductModel;
@Service
public class ProductServiceImpl implements ProductService {
   // @Autowired
	private ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public void add(ProductModel product) {
		System.out.println("In service Impl");
		productDao.add(product);
		
	}

	@Override
	public void all() {
		// TODO Auto-generated method stub
		
	}

}

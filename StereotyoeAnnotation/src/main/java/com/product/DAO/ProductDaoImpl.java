package com.product.DAO;

import org.springframework.stereotype.Repository;

import com.product.model.ProductModel;

@Repository

public class ProductDaoImpl implements ProductDao{

	@Override
	public void add(ProductModel product) {
		System.out.println("In Dao Impl");
		System.out.println(product.getpId()+"\t"+ product.getName()+"\t"+product.getPrice()+"\t"+product.getSeller());
		
	}

	@Override
	public void all() {
		// TODO Auto-generated method stub
		
	}

}

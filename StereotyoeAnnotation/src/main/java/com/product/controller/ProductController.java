package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.product.model.ProductModel;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

@Controller
public class ProductController {
//@Autowired	
private ProductService productService = new ProductServiceImpl();
public void addProduct(ProductModel product) {
	System.out.println("In Controller");
	productService.add(product);
}

}

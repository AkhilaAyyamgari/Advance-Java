package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Products;
import com.spring.boot.service.ProductService;
import com.spring.boot.utils.Response;


@RequestMapping("/product")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Object> addProduct(@RequestBody Products products){
		boolean result = productService.add(products);
		Response response = null;
		if(result == true) {
			response = new Response();
			response.setMessage("Product Added Succesfully");
			response.setOperationStatus("success");
			return new ResponseEntity<Object>(response, HttpStatus.ACCEPTED);
		}else {
			response = new Response();
			response.setMessage("Product Added Failure");
			response.setOperationStatus("Failure");
			return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
		}
		
	}
	@DeleteMapping("/deleteProduct")
	public ResponseEntity<Object> deleteProduct(@RequestBody Products products){
		boolean result = productService.delete(products);
		Response response = null;
		if(result == true) {
			response = new Response();
			response.setMessage("Product Deleted Succesfully");
			response.setOperationStatus("success");
			return new ResponseEntity<Object>(response, HttpStatus.ACCEPTED);
		}else {
			response = new Response();
			response.setMessage("Product Deletion Failure");
			response.setOperationStatus("Failure");
			return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> findAll(){
		List<Products> product = productService.findAll();
		return new ResponseEntity<Object>(product, HttpStatus.ACCEPTED);	
	}

	@PutMapping("/update")
	public ResponseEntity<Object> update(@RequestBody Products products){
		boolean result = productService.update(products);
		Response response = null;
		if(result == true) {
			response = new Response();
			response.setMessage("Product Updated Succesfully");
			response.setOperationStatus("success");
			return new ResponseEntity<Object>(response, HttpStatus.ACCEPTED);
		}else {
			response = new Response();
			response.setMessage("Product Updation Failure");
			response.setOperationStatus("Failure");
			return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
		}
}
}
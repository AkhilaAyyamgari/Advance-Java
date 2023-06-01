package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.spring.boot.model.Users;
import com.spring.boot.service.UserService;
import com.spring.boot.utils.Payment;
import com.spring.boot.utils.Response;
import org.json.JSONObject; 

@RestController
public class UserController{
 
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@RequestBody Users user) {

		boolean result = userService.add(user);
		Response response = null;
		if(result == true) {
			response = new Response();
			response.setMessage("Registration Successfull");
			response.setOperationStatus("Success");
			return new ResponseEntity<Object>(response,HttpStatus.ACCEPTED);
		}else {
			response = new Response();
			response.setMessage("Registration Failed!!!!!");
			response.setOperationStatus("Failure");
			return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
		}
		
	}
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody Users user){
		boolean result = userService.login(user);
		Response response = null;
		if(result == true) {
			response = new Response();
			response.setMessage("Registration Successfull");
			response.setOperationStatus("Success");
			return new ResponseEntity<Object>(response,HttpStatus.ACCEPTED);
		}else {
			response = new Response();
			response.setMessage("Registration Failed!!!!!");
			response.setOperationStatus("Failure");
			return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PostMapping("/createOrder")
	public ResponseEntity<Object> createOrder(@RequestBody Payment payment) throws RazorpayException{
		RazorpayClient client = new RazorpayClient("rzp_test_UZXIzfBHKNBy6B","o0KQ6mUFcI9RuoSIDox2JytR");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("currency",payment.getCurrency());
		jsonObject.put("amount",payment.getAmount());
		jsonObject.put("receipt", payment.getReceipt());
		
		Order order = client.orders.create(jsonObject);
		Response response = new Response();
		response.setMessage(order.get("id"));
		response.setOperationStatus("order created");
	
		return new ResponseEntity<Object>(response,HttpStatus.CREATED);
	}
}

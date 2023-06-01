package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages= {"com.spring.boot"})
@EntityScan(basePackages= {"com.spring.boot.model"})
@SpringBootApplication
public class DigicartApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigicartApplication.class, args);
	}
	

}

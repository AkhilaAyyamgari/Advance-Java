package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTabledemo {
	 static Connection connection = null;
	 static Statement statement= null;
	    
	public static void main(String[] args) {
	getDatabaseConnection();
	createTable(1, "Akhila", "akhil123");
	}
 static void getDatabaseConnection()  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root", "Password@123");
		statement = connection.createStatement(); 
		}
	catch(Exception e) {
		System.out.println(e);	
	}
	}
     static void createTable(int id, String username, String password)
  {
		String query = "create table Product(id int, username Varchar(20), password Varchar(30))";
		try{
		statement.execute(query);
		System.out.println("Table created");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

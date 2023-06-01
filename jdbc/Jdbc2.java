package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root","Password@123");
	System.out.println(connection);
	
	Statement statement = connection.createStatement();
	
	statement.execute("create table Data(userId int, username Varchar(20), password Varchar(10))");
	statement.execute("insert into Data values(1, 'Akhila', 'Akhila@123')");
	statement.execute("insert into Data values(2, 'Raghu', 'Raghu@123')");
	statement.execute("insert into Data values(3, 'Saarvi', 'Saarvi@123')");
	
	statement.close();
	connection.close();
	
	}
	

}

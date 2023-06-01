package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Class.forName("com.mysql.cj.jdbc.Driver");
     
     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root", "Password@123");
     System.out.println(connection);
    
    Statement statement = connection.createStatement(); 
  try {  
    //statement.execute("insert into users values(4,'Random', 'Random@123')");
    //statement.execute("delete from users where userId=2");
    //statement.execute("insert into users values(2,'Raghu', 'Raghu@123')");
    statement.execute("update users set username='Raghu Nalachervu' where userId=2");
    
  }
  catch(Exception e) {
	  System.out.println(e);
  }

	statement.close();
	
	
	connection.close();
	
	}

}

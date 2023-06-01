package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductManagement {
    static Connection connection = null;
    static Statement statement= null;
    
	public static void main(String[] args) {
	getDatabaseConnection();
	//createProduct(7, "Sony", 90000,"sony.com", 2);
	//insertProduct(4, "Realme", 15000,"real.com", 30);
      //deleteProduct(4);
	 //updateProduct(4, null, "Realme.com");
	//closeConnection();
	getAllProducts();
	}
    static void getDatabaseConnection()
    {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/productmanagement", "root", "Password@123");
    	statement= connection.createStatement();
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    }
   
//  static void createProduct(int pid, String productname, int price, String seller, int quantity)
//  {
// String query = "create table Product"+pid+", "+productname+","+price+","+seller+", "+quantity+"";
// try {
//	 statement.execute(query);
//    	 System.out.println("Product Table Created");
//		 }
//		catch(Exception e) {	 
//  System.out.println(e);
//	}
//	 }
    
    static void insertProduct(int id, String pname, int price, String seller, int quantity) {
    	String query = "insert into product values("+id+",'"+pname+"',"+price+",'"+seller+"', "+quantity+" )";
    try{
    	statement.execute(query);
    	System.out.println("Insertion done");
    }
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
    static void deleteProduct(int id) {
    	String query = "delete form product where pid="+id;
    try{
    	statement.execute(query);
    	System.out.println("Deletion done");
    }
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
    
    static void updateProduct(int id, String pname, String seller) {
    	String query = "";
    	if (pname == null && seller != null)
		{
		query = "update product set seller='"+seller+"' where pid="+id;
		}
		else 
			if(pname != null && seller ==null)
			{
				query = "product users set pname='"+pname+"' where pid="+id;
				}
    		try {
    	statement.execute(query);
    	System.out.println("Updation done");
    }
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }

   static void closeConnection() {
	   try {
		   connection.close();
	   }
	   catch(Exception e) {
   		System.out.println(e);
   	}   
   }
   static void getAllProducts() {
	   try {
	   ResultSet rs = statement.executeQuery("select * from product");
	   System.out.println("pid       pname      price     seller    quantity");
	   System.out.println("-------------------------------------------------");
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1)+"       "+rs.getString(2)+"       "+rs.getInt(3)+"       "+rs.getString(4)+"       "+rs.getInt(5));
	   }
	   
}
	   catch(Exception e) {
		   System.out.println(e);
	   }
   }
} 

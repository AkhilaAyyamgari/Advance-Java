package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
Statement statement = null;

@Override
public void init(ServletConfig config) throws ServletException {
	String username = config.getInitParameter("username");
	String password = config.getInitParameter("password");
	String url = config.getInitParameter("url");
	String driverClassName = config.getInitParameter("driver");
	System.out.println(username+ "\t" + password);
	try  {
		Class.forName(driverClassName);
		statement = DriverManager.getConnection(url, username, password).createStatement();
	}catch(Exception e) {
		System.out.println(e);
	}
}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("statement" + statement);
	PrintWriter out = resp.getWriter();
	out.println("<html>\r\n"
			+ "<head>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "<form action = \"./user\" method= \"post\">\r\n"
			+ "    <input type = \"number\" name = \"userId\" placeholder=\"Enter UserId\"> <br> </br>\r\n"
//			+ "    <input type = \"text\" name = \"username\" placeholder=\"Enter UserName\"> <br> </br>   \r\n"
//			+ "    <input type = \"text\" name = \"password\" placeholder=\"Enter Password\"> <br> </br>\r\n"
            + "    <button> Delete User</button>\r\n"
			+ "</body>\r\n"
			+ "</html>");
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int userId = Integer.parseInt(req.getParameter("userId"));
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	// Adding User
//	String query = "insert into users values ("+userId+", '"+username+"', '"+password+"')";
//	try {
//		statement.execute(query);
//		System.out.println("done");
//	}catch(Exception e) {
//		System.out.println(e);
//	}
	// Delete  User
String query = "delete from users where userId="+userId;
try {
	statement.execute(query);
	System.out.println("done");
}catch(Exception e) {
	System.out.println(e);
}
}

}

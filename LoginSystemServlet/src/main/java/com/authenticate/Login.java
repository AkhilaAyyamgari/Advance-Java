package com.authenticate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =resp.getWriter();
		out.print("<html>\r\n"
				+ "<body>\r\n"
				+ "<form = \".\\login\", method=\"post\">\r\n"
				+ "<label for =\"uname\">Username</label>\r\n"
				+ "<input type=\"text\" placeholder =\"username\" name=\"uname\">\r\n"
				+ "<label for =\"psw\">Password</label>\r\n"
				+ "<input type=\"text\" placeholder =\"password\" name=\"psw\">\r\n"
				+ "<button type = \"Submit\"> Login </button>\r\n"
				+ "\r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("uname");
		String password = req.getParameter("psw");
		PrintWriter out = resp.getWriter();
		
		if(username.contentEquals("akhila") && password.contentEquals("akhi")) {
			out.print("<h1>Login Success!!! Redirected here</h1>");
		}else {
			out.print("<h1>Login Failure</h1>");
	}
	}
}

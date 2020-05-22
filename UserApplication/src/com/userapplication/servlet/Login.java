package com.userapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.userapplication.service.UserService;



/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService us = new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(us.check(userName, password))
		{
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			response.sendRedirect("Home.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
		
	}

	

}

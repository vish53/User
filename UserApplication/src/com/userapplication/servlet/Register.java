package com.userapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.userapplication.bean1.UserBean;
import com.userapplication.service.UserService;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService us = new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String contact =request.getParameter("contact");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");

		UserBean ub = new UserBean();
		ub.setFirstName(firstName);
		ub.setLastName(lastName);
		ub.setContact(contact);
		ub.setEmail(email);
		ub.setAddress(address);
		ub.setUserName(userName);
		ub.setPassword(password);
		ub.setConfirmPassword(confirmPassword);

		int status=us.addUSer(ub);
		if(status>0)
		{
			HttpSession session = request.getSession();
			session.setAttribute("lastName", firstName+ lastName);
			response.sendRedirect("Home2.jsp");
			out.print("<p>Successfully Registered</p>");
		}
		else
		{
			out.print("Sorry");
		}
	}

}

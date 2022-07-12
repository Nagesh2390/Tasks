package com.sriraj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogIn_Servlet extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if(email!=null && password!=null) {
			HttpSession session=request.getSession(true);
			session.setAttribute("Email", email);
			if(email!=null) {
			RequestDispatcher rd=request.getRequestDispatcher("Profile.jsp");
			rd.forward(request, response);}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

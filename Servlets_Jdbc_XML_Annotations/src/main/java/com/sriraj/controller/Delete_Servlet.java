package com.sriraj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sriraj.dao.DaoImpl;
import com.sriraj.dao.IDao;

@WebServlet("/deleteSpecific")
public class Delete_Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IDao i = new DaoImpl();
		boolean flag = i.delete(Integer.parseInt(request.getParameter("pin")));
		if (flag) {
			PrintWriter pw = response.getWriter();
			pw.println("Record Deleted Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			rd.include(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

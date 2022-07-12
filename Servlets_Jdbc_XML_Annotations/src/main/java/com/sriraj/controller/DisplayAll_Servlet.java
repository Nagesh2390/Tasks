package com.sriraj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sriraj.dao.DaoImpl;
import com.sriraj.dao.IDao;
import com.sriraj.model.Student;

@WebServlet("/getAllRecords")
public class DisplayAll_Servlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		IDao iDao = new DaoImpl();
		List<Student> list = iDao.select();
	
		if(!list.isEmpty()) {
			request.setAttribute("All", list);
			RequestDispatcher rd = request.getRequestDispatcher("AllRecords.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

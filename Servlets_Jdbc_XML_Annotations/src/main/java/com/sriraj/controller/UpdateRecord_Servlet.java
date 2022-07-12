package com.sriraj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sriraj.dao.DaoImpl;
import com.sriraj.dao.IDao;
import com.sriraj.model.Student;

@WebServlet("/UpdateRecord")
public class UpdateRecord_Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	Student student=new Student();
	student.setPinnumber(Integer.parseInt(request.getParameter("pin")));
	student.setName(request.getParameter("name"));
	IDao iDao=new DaoImpl();
	int i=iDao.update(student);
	if(i>0) {
		PrintWriter pw = response.getWriter();
		pw.println("Record Updated Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
		rd.include(request, response);
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("UpdateRecord.html");
		rd.include(request, response);
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

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
import com.sriraj.model.Student;

@WebServlet("/InsertRecord")
public class InsertStudent_Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		Student student = new Student();
		student.setPinnumber(Integer.parseInt(request.getParameter("pin")));
		student.setName(request.getParameter("name"));
		student.setGender(request.getParameter("gender"));
		student.setTelugu(Integer.parseInt(request.getParameter("telugu")));
		student.setEnglish(Integer.parseInt(request.getParameter("english")));
		student.setMaths(Integer.parseInt(request.getParameter("maths")));
		student.setMaths(Integer.parseInt(request.getParameter("physics")));
		student.setMaths(Integer.parseInt(request.getParameter("chemistry")));
		IDao iDao = new DaoImpl();
		int i = iDao.insert(student);
		if (i > 0) {
			PrintWriter pw = response.getWriter();
			pw.println("Record Inserted Successfully. Insert More Records");
			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			rd.include(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("InsertRecords.html");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

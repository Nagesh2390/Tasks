package com.sriraj.controller;

import java.io.IOException;

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

@WebServlet("/getSpecificRecord")
public class DisplayOne_Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	IDao idao=new DaoImpl();
	 String pinString=request.getParameter("pin");
	 int pin=Integer.parseInt(pinString);
	 Student student=idao.selectbypin(pin);
	 if(student!=null) {
		 request.setAttribute("Student", student);
		 RequestDispatcher rd=request.getRequestDispatcher("OneRecord.jsp");
		 rd.forward(request, response);
	 }
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

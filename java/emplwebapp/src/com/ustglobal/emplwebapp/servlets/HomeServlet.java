package com.ustglobal.emplwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.emplwebapp.dto.EmployeeInfo;
@WebServlet("/home")
public class HomeServlet  extends HttpServlet{

	
	@Override
	
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
	HttpSession session = req.getSession(false);
	if(session!=null) {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
			dispatcher.forward(req, resp);
	
	
}else {
	RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
	dispatcher.forward(req, resp);
}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}

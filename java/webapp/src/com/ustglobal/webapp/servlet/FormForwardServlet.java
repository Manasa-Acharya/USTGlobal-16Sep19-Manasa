package com.ustglobal.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormForwardServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/first");
		dispatcher.forward(req, resp);
}
}

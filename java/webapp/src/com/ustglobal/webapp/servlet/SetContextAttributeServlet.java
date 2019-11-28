package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetContextAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		ServletContext context = getServletContext();
		Object obj = new Object();
		context.setAttribute("obj", obj);
		
		
		PrintWriter out = resp.getWriter();
		out.println("<h1> setting context attribute to object</h1>");
	}
}

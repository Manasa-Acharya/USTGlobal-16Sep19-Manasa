package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>This is Include Servlet");
		out.println("</body>");
		out.println("</html>");
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/first");
		dispatcher.include(req, resp);
	}

}
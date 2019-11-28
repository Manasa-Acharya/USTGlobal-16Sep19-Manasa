package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmpServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
	
		String empid = req.getParameter("empid");
		int id = Integer.parseInt(empid);
		
		PrintWriter out = resp.getWriter();
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id= ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int eid = rs.getInt("id");
				int esal = rs.getInt("sal");
				String ename = rs.getString("name");
				String egender = rs.getString("gender");
				
				out.println("<html>");
				out.println("<body>");
				out.println("<table>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("EmpId");
				out.println("</th>");
				out.println("<th>");
				out.println("Name");
				out.println("</th>");
				out.println("<th>");
				out.println("salary");
				out.println("</th>");
				out.println("<th>");
				out.println("Gender");
				out.println("</th>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>");
				out.println(eid);
				out.println("</td>");
				out.println("<td>");
				out.println(ename);
				out.println("</td>");
				out.println("<td>");
				out.println(esal);
				out.println("</td>");
				out.println("<td>");
				out.println(egender);
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("<body>");
				out.println("</html>");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
					
				}
				if(pstmt!=null) {
					pstmt.close();
					
				}
				if(rs!=null) {
					rs.close();
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

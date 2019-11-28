package com.ustglobal.jpawithibernateproject.dao;


	

	import java.sql.Connection;
	import java.sql.DriverManager;

	import com.mysql.jdbc.Driver;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class MyFirstJPAHibernate {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
//			step1:load the driver;
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
//			step2:Get the connection;
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
					
			conn = DriverManager.getConnection(url);
//			step3:Issue SQL query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
//			step4:Read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("id is " +id);
				System.out.println("Name is " +name);
				System.out.println("salary is " +sal);
				System.out.println("Gender is " +gender);
				System.out.println("-----------------------");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
//			step5: close all JDBC connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
						
					}
					if(rs!=null) {
						rs.close();
					}
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		




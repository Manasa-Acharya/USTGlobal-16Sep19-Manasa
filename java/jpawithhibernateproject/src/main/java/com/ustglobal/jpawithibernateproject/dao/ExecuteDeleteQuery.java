package com.ustglobal.jpawithibernateproject.dao;


	

	import java.io.FileReader;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	//import java.sql.Statement;
	import java.util.Properties;

import com.mysql.jdbc.Driver;

	//import com.mysql.jdbc.Driver;

	public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
//		FileReader reader = null;
		
		
		try {
//			reader = new FileReader("db.properties");
//			Properties prop = new Properties();
//			prop.load(reader);
//			Class.forName(prop.getProperty("driver-class-name"));
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			String sql = "delete from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);
			
			
			
			 pstmt.setInt(1,Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) deleted ");
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
//				if(reader!=null) {
//					reader.close();
//				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	}
	

}

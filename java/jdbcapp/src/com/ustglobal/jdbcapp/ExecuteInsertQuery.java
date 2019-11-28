package com.ustglobal.jdbcapp;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
public static void main(String[] args) {
	Connection conn = null;
//	Statement stmt = null;
	PreparedStatement pstmt = null;
	FileReader reader = null;
	try {
		reader = new FileReader("db.properties");
	Properties prop = new Properties();
	prop.load(reader);
	Class.forName(prop.getProperty("driver-class-name"));
//		step1 load the driver
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
//		step2:Get the connection;
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	conn = DriverManager.getConnection(url);
	
	String sql = prop.getProperty("insert-query");
	
//	stmt = conn.createStatement();
	pstmt = conn.prepareStatement(sql);
//	int count = stmt.executeUpdate(sql);
	
	String empid = args[0];
	int id = Integer.parseInt(empid);
	pstmt.setInt(1,id);
	
	String empname = args[1];
	String name = args[1];
	pstmt.setString(2,name);
	
	String empsal = args[2];
	int sal = Integer.parseInt(empsal);
	pstmt.setInt(3,sal);
	
	String empgender = args[3];
	String gender = args[3];
	pstmt.setString(4,gender);
	int count = pstmt.executeUpdate();
	
//	step4:Read the Result
	System.out.println(count + " Row(s) inserted ");
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
			if(reader!=null) {
				reader.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
}

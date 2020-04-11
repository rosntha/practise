package com.roshan.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	
	
	 public static Connection getConnect(){
	  
		 Connection conn=null;

			System.out.println("-------- MySQL JDBC Connection Testing ------------");

			try {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "123456");

			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				
			}

			
			return conn;
	 }
	 

}

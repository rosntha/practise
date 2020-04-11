package com.roshan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.roshan.db.dbConnection;
import com.roshan.dto.user;

public class display {
	public void displayone(String userName) {
	Connection conn=null;
	PreparedStatement ps=null;
	user u=new user();
	conn=dbConnection.getConnect();
	try {
		ps=conn.prepareStatement("select *from user where userName=?");
		ps.setString(1,userName);;
		
		ResultSet rs=ps.executeQuery();	
		while(rs.next()) {
			rs.getString(1);
			rs.getString(2);
			rs.getString(3);
			rs.getString(4);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}
}	



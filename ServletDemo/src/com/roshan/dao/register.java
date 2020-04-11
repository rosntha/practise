package com.roshan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.roshan.db.dbConnection;
import com.roshan.dto.user;

public class register {
	
	public static String registerUser(user s) {
		
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn = dbConnection.getConnect();
			 ps = conn.prepareStatement( "insert into user values(?,?,?,?)");
			ps.setString(1,s.getUserName());
			ps.setString(2, s.getUserPass());
			ps.setString(3,s.getUserEmail());
			ps.setString(4,s.getUserCountry());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return("saved");
		
	}
	
}

package com.roshan.dto;

public class user {
	String userName;
	String userPass;
	String userEmail;
	String userCountry;
	
	/*public user(String userName, String userPass, String userEmail, String userCountry) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userEmail = userEmail;
		this.userCountry = userCountry;
	}

	public user() {
		super();
		
	}*/

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	
	
	
	
	
	

}

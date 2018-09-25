package com.medcare.older.pojo;

public class UserLogin {

	private int user_login_id;
	private String user_name;
	private String user_password;
	
	
	public int getUser_login_id() {
		return user_login_id;
	}


	public void setUser_login_id(int user_login_id) {
		this.user_login_id = user_login_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_password() {
		return user_password;
	}


	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	public UserLogin() {
	}


	public UserLogin(int user_login_id, String user_name, String user_password) {
		super();
		this.user_login_id = user_login_id;
		this.user_name = user_name;
		this.user_password = user_password;
	}
	
	

}

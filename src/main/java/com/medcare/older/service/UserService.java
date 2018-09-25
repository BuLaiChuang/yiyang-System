package com.medcare.older.service;

import java.util.ArrayList;

import com.medcare.older.pojo.Old;
import com.medcare.older.pojo.UserInf;
import com.medcare.older.pojo.UserLogin;



public interface UserService {
	
	//用户注册
	public void regist(UserLogin user);
	
	//用户登录
	UserLogin login(String user_name,String user_password);
    
	//用户信息完善
	public void perfect(Old older);
	
	ArrayList<UserInf> getAllUsers();
	
	boolean removeUser(int id);
	
}

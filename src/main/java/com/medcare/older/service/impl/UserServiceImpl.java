package com.medcare.older.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.medcare.older.mapper.UserMapper;
import com.medcare.older.pojo.Old;
import com.medcare.older.pojo.UserInf;
import com.medcare.older.pojo.UserLogin;
import com.medcare.older.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	
	@Resource(name="userMapper")
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public ArrayList<UserInf> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}
    
	//登录
	@Override
	public UserLogin login(String user_name, String user_password) {
		return userMapper.findWithLoginAndPassword(user_name, user_password);
	}
    
	//注册
	@Override
	public void regist(UserLogin user) {
		userMapper.addUser(user);
	}

    //完善信息
	@Override
	public void perfect(Old older) {
		userMapper.perfectUser(older);
	}


	

	

}

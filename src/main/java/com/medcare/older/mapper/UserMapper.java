package com.medcare.older.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.medcare.older.pojo.Old;
import com.medcare.older.pojo.UserInf;
import com.medcare.older.pojo.UserLogin;


public interface UserMapper {
	

    @Select("select * from t_user_login where user_name=#{user_name} and user_password=#{user_password}")
    public UserLogin findWithLoginAndPassword(@Param("user_name")String user_name,@Param("user_password")String user_password);
    
    @Insert("insert into t_user_login(user_name,user_password) values (#{user_name},#{user_password})")
	public void addUser(UserLogin user);
	
    @Insert("insert into t_old(old_id,old_age,old_phone,old_sex,old_idcard,old_birthday,old_address) values(#{old_id},#{old_age},#{old_phone},#{old_sex},#{old_idcard},#{old_birthday},#{old_address})")
    public void perfectUser(Old older);
    
    ArrayList<UserInf> getAllUsers();
	
	boolean removeUser(int id);

	
	
}

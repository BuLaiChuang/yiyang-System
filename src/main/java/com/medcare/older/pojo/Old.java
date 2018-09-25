package com.medcare.older.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Old {
    private int old_id;
    private int old_age;
    private String old_phone;
    private String old_sex;
    private String old_idcard;
    @DateTimeFormat(pattern = "yyyy-MM-dd")  
    private Date old_birthday;
    private String old_address;
    
	public int getOld_id() {
		return old_id;
	}
	public void setOld_id(int old_id) {
		this.old_id = old_id;
	}
	public int getOld_age() {
		return old_age;
	}
	public void setOld_age(int old_age) {
		this.old_age = old_age;
	}
	public String getOld_phone() {
		return old_phone;
	}
	public void setOld_phone(String old_phone) {
		this.old_phone = old_phone;
	}
	
	public String getOld_sex() {
		return old_sex;
	}
	public void setOld_sex(String old_sex) {
		this.old_sex = old_sex;
	}
	
	public String getOld_idcard() {
		return old_idcard;
	}
	public void setOld_idcard(String old_idcard) {
		this.old_idcard = old_idcard;
	}
	public Date getOld_birthday() {
		return old_birthday;
	}
	public void setOld_birthday(Date old_birthday) {
		this.old_birthday = old_birthday;
	}
	public String getOld_address() {
		return old_address;
	}
	public void setOld_address(String old_address) {
		this.old_address = old_address;
	}
	public Old(int old_id, int old_age, String old_phone, String old_sex, String old_idcard, Date old_birthday,
			String old_address) {
		super();
		this.old_id = old_id;
		this.old_age = old_age;
		this.old_phone = old_phone;
		this.old_sex = old_sex;
		this.old_idcard = old_idcard;
		this.old_birthday = old_birthday;
		this.old_address = old_address;
	}
	public Old() {
		super();
	}
    
    
}

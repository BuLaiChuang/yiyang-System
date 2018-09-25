package com.medcare.older.pojo;

public class OlderHealthyOne {
     private int healthy_id;
     private int old_id;
     private String healthy_name;
     private String healthy_time;
     private String healthy_state;
     private String healthy_num;
	public int getHealthy_id() {
		return healthy_id;
	}
	public void setHealthy_id(int healthy_id) {
		this.healthy_id = healthy_id;
	}
	public int getOld_id() {
		return old_id;
	}
	public void setOld_id(int old_id) {
		this.old_id = old_id;
	}
	public String getHealthy_name() {
		return healthy_name;
	}
	public void setHealthy_name(String healthy_name) {
		this.healthy_name = healthy_name;
	}
	public String getHealthy_time() {
		return healthy_time;
	}
	public void setHealthy_time(String healthy_time) {
		this.healthy_time = healthy_time;
	}
	public String getHealthy_state() {
		return healthy_state;
	}
	public void setHealthy_state(String healthy_state) {
		this.healthy_state = healthy_state;
	}
	public String getHealthy_num() {
		return healthy_num;
	}
	public void setHealthy_num(String healthy_num) {
		this.healthy_num = healthy_num;
	}
	public OlderHealthyOne(int healthy_id, int old_id, String healthy_name, String healthy_time, String healthy_state,String healthy_num) {
		super();
		this.healthy_id = healthy_id;
		this.old_id = old_id;
		this.healthy_name = healthy_name;
		this.healthy_time = healthy_time;
		this.healthy_state = healthy_state;
		this.healthy_num=healthy_num;
	}
	public OlderHealthyOne() {
		super();
		// TODO Auto-generated constructor stub
	}
}

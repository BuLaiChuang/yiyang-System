package com.medcare.older.pojo;

public class OlderHealthyValueWarn {
	
	private int value_information_id;
	private int healthy_id;
	private int old_id;
	private String healthy_name;
	private String healthy_time;
	private String healthy_state;
	private String healthy_num;
	private String value_min;
	private String value_max;
	private String warn;


	public int getValue_information_id() {
		return value_information_id;
	}


	public int getHealthy_id() {
		return healthy_id;
	}


	public int getOld_id() {
		return old_id;
	}


	public String getHealthy_name() {
		return healthy_name;
	}


	public String getHealthy_time() {
		return healthy_time;
	}


	public String getHealthy_state() {
		return healthy_state;
	}


	public String getHealthy_num() {
		return healthy_num;
	}


	public String getValue_min() {
		return value_min;
	}


	public String getValue_max() {
		return value_max;
	}


	public String getWarn() {
		return warn;
	}


	public void setValue_information_id(int value_information_id) {
		this.value_information_id = value_information_id;
	}


	public void setHealthy_id(int healthy_id) {
		this.healthy_id = healthy_id;
	}


	public void setOld_id(int old_id) {
		this.old_id = old_id;
	}


	public void setHealthy_name(String healthy_name) {
		this.healthy_name = healthy_name;
	}


	public void setHealthy_time(String healthy_time) {
		this.healthy_time = healthy_time;
	}


	public void setHealthy_state(String healthy_state) {
		this.healthy_state = healthy_state;
	}


	public void setHealthy_num(String healthy_num) {
		this.healthy_num = healthy_num;
	}


	public void setValue_min(String value_min) {
		this.value_min = value_min;
	}


	public void setValue_max(String value_max) {
		this.value_max = value_max;
	}


	public void setWarn(String warn) {
		this.warn = warn;
	}


	public OlderHealthyValueWarn(int value_information_id, int healthy_id, int old_id, String healthy_name,
			String healthy_time, String healthy_state, String healthy_num, String value_min, String value_max,
			String warn) {
		super();
		this.value_information_id = value_information_id;
		this.healthy_id = healthy_id;
		this.old_id = old_id;
		this.healthy_name = healthy_name;
		this.healthy_time = healthy_time;
		this.healthy_state = healthy_state;
		this.healthy_num = healthy_num;
		this.value_min = value_min;
		this.value_max = value_max;
		this.warn = warn;
	}


	public OlderHealthyValueWarn() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String toString() {
	
		 double a = Double.parseDouble(this.healthy_num);
		  double b = Double.parseDouble(value_max);
		  double c = Double.parseDouble(value_min);
		
		if (a>b) {
			return healthy_time + " 测量了：" + healthy_name + " 测量值为：" + healthy_num+"超出预设值";
			
		}else if(a < c){
		   return healthy_time + " 测量了：" + healthy_name + " 测量值为：" + healthy_num+"低于预设值";
				
		  }   
		return "出错";
		}
	


	
}

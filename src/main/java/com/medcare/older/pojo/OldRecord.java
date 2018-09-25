package com.medcare.older.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OldRecord 
{
	private int record_id;
	private int old_id;
	private String record_hospital;
	private String record_section;
	private String record_sickroom;
	private String record_number;
	@DateTimeFormat(pattern = "yyyy-MM-dd")  
	private Date   record_starttime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")  
	private Date   record_endtime;
	private String record_describe; 
	public int getOld_id() {
		return old_id;
	}
	public void setOld_id(int old_id) {
		this.old_id = old_id;
	}
	public int getRecord_id() {
		return record_id;
	}
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	public String getRecord_hospital() {
		return record_hospital;
	}
	public void setRecord_hospital(String record_hospital) {
		this.record_hospital = record_hospital;
	}
	public String getRecord_section() {
		return record_section;
	}
	public void setRecord_section(String record_section) {
		this.record_section = record_section;
	}
	public String getRecord_sickroom() {
		return record_sickroom;
	}
	public void setRecord_sickroom(String record_sickroom) {
		this.record_sickroom = record_sickroom;
	}
	public String getRecord_number() {
		return record_number;
	}
	public void setRecord_number(String record_number) {
		this.record_number = record_number;
	}
	public Date getRecord_starttime() {
		return record_starttime;
	}
	public void setRecord_starttime(Date record_starttime) {
		this.record_starttime = record_starttime;
	}
	public Date getRecord_endtime() {
		return record_endtime;
	}
	public void setRecord_endtime(Date record_endtime) {
		this.record_endtime = record_endtime;
	}
	public String getRecord_describe() {
		return record_describe;
	}
	public void setRecord_describe(String record_describe) {
		this.record_describe = record_describe;
	}
	public OldRecord(int record_id, String record_hospital, String record_section, String record_sickroom,
			String record_number, Date record_starttime, Date record_endtime, String record_describe,int old_id) {
		super();
		this.record_id = record_id;
		this.record_hospital = record_hospital;
		this.record_section = record_section;
		this.record_sickroom = record_sickroom;
		this.record_number = record_number;
		this.record_starttime = record_starttime;
		this.record_endtime = record_endtime;
		this.record_describe = record_describe;
		this.old_id = old_id;
	}
	public OldRecord() {
		super();
	}
	
	
	


}

package com.medcare.older.pojo;

public class OlderHealthyValueInformation {
	private int value_information_id;

	private int old_id;
	private String value_name;
	private String value_min;
	private String value_max;
	private String value_statue;
	public int getValue_information_id() {
		return value_information_id;
	}
	public void setValue_information_id(int value_information_id) {
		this.value_information_id = value_information_id;
	}
	public int getOld_id() {
		return old_id;
	}
	public void setOld_id(int old_id) {
		this.old_id = old_id;
	}
	public String getValue_name() {
		return value_name;
	}
	public void setValue_name(String value_name) {
		this.value_name = value_name;
	}
	public String getValue_min() {
		return value_min;
	}
	public void setValue_min(String value_min) {
		this.value_min = value_min;
	}
	public String getValue_max() {
		return value_max;
	}
	public void setValue_max(String value_max) {
		this.value_max = value_max;
	}
	public String getValue_statue() {
		return value_statue;
	}
	public void setValue_statue(String value_statue) {
		this.value_statue = value_statue;
	}
	public OlderHealthyValueInformation(int value_information_id, int old_id, String value_name, String value_min,
			String value_max, String value_statue) {
		super();
		this.value_information_id = value_information_id;
		this.old_id = old_id;
		this.value_name = value_name;
		this.value_min = value_min;
		this.value_max = value_max;
		this.value_statue = value_statue;
	}
	public OlderHealthyValueInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
}

package com.medcare.older.service;

import java.util.ArrayList;

import com.medcare.older.pojo.OlderHealthy;
import com.medcare.older.pojo.OlderHealthyOne;


public interface OlderHealthyService {
	
	//查询血压值
	ArrayList<OlderHealthyOne> getAllMb(int old_id);
	
	ArrayList<OlderHealthyOne> getAllSS(int old_id);
	
	ArrayList<OlderHealthyOne> getAllSZ(int old_id);
	//查询血糖信息
	ArrayList<OlderHealthy> getAllXueTang(int old_id);
	//查询血氧信息
	ArrayList<OlderHealthy> getAllXueYang(int old_id);
	
}

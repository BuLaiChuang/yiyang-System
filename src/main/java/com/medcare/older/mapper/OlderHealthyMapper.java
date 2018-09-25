package com.medcare.older.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.medcare.older.pojo.OlderHealthy;
import com.medcare.older.pojo.OlderHealthyOne;


@Repository("olderHealthyMapper")
public interface OlderHealthyMapper {
	//查询血压值
	ArrayList<OlderHealthyOne> getAllMb(int old_id);
	ArrayList<OlderHealthyOne> getAllSS(int old_id);
	ArrayList<OlderHealthyOne> getAllSZ(int old_id);
	//查询血糖信息
	ArrayList<OlderHealthyOne> getAllXueTang(int old_id);
	//查询血氧信息
	ArrayList<OlderHealthyOne> getAllXueYang(int old_id);
	
}

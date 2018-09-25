package com.medcare.older.service;

import java.util.ArrayList;

import com.medcare.older.pojo.OlderHealthyValueInformation;
import com.medcare.older.pojo.OlderHealthyValueWarn;

public interface OlderHealthyValueService {
	
	
	//查询所有警告指标的阈值
		ArrayList<OlderHealthyValueInformation> getAllValue(int old_id);	
		
	//查询一条警告指标的阈值
		OlderHealthyValueInformation getOneValue(int old_id);	
		
	//删除一条阈值
		void removeOneValue(int old_id, int value_information_id);
	
	//查询所有异常指标
		ArrayList<OlderHealthyValueWarn> getAllValueWarn(int old_id);
	
	//修改信息
	void updateOneValue(OlderHealthyValueInformation olderHealthyValueInformation);
		
	
	//修改异常状态
		void  headleValueWarn(int old_id, int healthy_id);
}
package com.medcare.older.mapper;


import java.util.ArrayList;

import org.springframework.stereotype.Repository;


import com.medcare.older.pojo.OlderHealthyValueInformation;
import com.medcare.older.pojo.OlderHealthyValueWarn;

@Repository("olderHealthyValueMapper")
public interface OlderHealthyValueMapper {
	// void insertOneValue(String name,OlderHealthyValueInforamation inforamation);
	
	//public void updateOneValue(String name,OlderHealthyValueInforamation inforamation); 
	
	//public deletOneValue(int old_id,String valuename);
	//查询所有警告指标的阈值
	OlderHealthyValueInformation getAllValue(int old_id,int value_id);
	
	//查询一条预警阈值
	OlderHealthyValueInformation getOneValue(int id);
	
	ArrayList<OlderHealthyValueInformation> getAllValue(int old_id);
	
	void removeOneValue(OlderHealthyValueInformation olderHealthyValueInformation);
	//删除一条预警阈值
	
	void updateOneValue(OlderHealthyValueInformation olderHealthyValueInformation);
	//修改一条预警阈值
	
	void showOneValue(OlderHealthyValueInformation olderHealthyValueInformation);
	//显示一条预警阈值
	
	//查询所有异常
	ArrayList <OlderHealthyValueWarn>  getAllValueWarn(int old_id);
	//修改异常状态
	void  headleValueWarn(OlderHealthyValueWarn OlderhealthyValueWarn);
}

package com.medcare.older.service.impl;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medcare.older.mapper.OlderHealthyValueMapper;
import com.medcare.older.pojo.OlderHealthyValueInformation;
import com.medcare.older.pojo.OlderHealthyValueWarn;
import com.medcare.older.service.OlderHealthyValueService;


@Service("olderHealthyValueService")
public class OlderHealthyValueServiceImpl implements OlderHealthyValueService {

	@Autowired
	private OlderHealthyValueMapper olderHealthyValueMapper;

	//得到所有预警阈值
	@Override
	public ArrayList<OlderHealthyValueInformation> getAllValue(int old_id) {
		
		return olderHealthyValueMapper.getAllValue(old_id);
	}
	
	
	
    //删除一条预警阈值
	@Override
	public void removeOneValue(int old_id,int value_information_id) {
		OlderHealthyValueInformation olderHealthyValueInformation=new OlderHealthyValueInformation( value_information_id,old_id, null, null, null, null);
		olderHealthyValueMapper.removeOneValue(olderHealthyValueInformation);
		return;
	}
    //查询所有预警信息
	@Override
	public ArrayList<OlderHealthyValueWarn> getAllValueWarn(int old_id) {
		
		return olderHealthyValueMapper.getAllValueWarn(old_id);
		
	}
	//处理一条异常状态
	public void headleValueWarn(int old_id, int healthy_id) {
		
			OlderHealthyValueWarn olderHealthyValueWarn1=new OlderHealthyValueWarn(0,healthy_id,old_id,null,null, null, null,null,null, null);
			olderHealthyValueMapper.headleValueWarn(olderHealthyValueWarn1);
			return;
			
		
		
	}
   //得到一条预警阈值的信息
	@Override
	public OlderHealthyValueInformation getOneValue(int id) {
		
		 return olderHealthyValueMapper.getOneValue(id);
	}

    //修改阈值信息

	
	public void updateOneValue(OlderHealthyValueInformation olderHealthyValueInformation) {
		olderHealthyValueMapper.updateOneValue(olderHealthyValueInformation);;
		
	}

	



}

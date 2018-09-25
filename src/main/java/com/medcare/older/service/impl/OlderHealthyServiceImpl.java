package com.medcare.older.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.medcare.older.mapper.OlderHealthyMapper;
import com.medcare.older.pojo.OlderHealthy;
import com.medcare.older.pojo.OlderHealthyOne;
import com.medcare.older.service.OlderHealthyService;


@Service("olderHealthyService")
public class OlderHealthyServiceImpl implements OlderHealthyService {

	private OlderHealthyMapper olderHealthyMapper;
	
	@Resource(name="olderHealthyMapper")
	public void setOlderHealthyMapper(OlderHealthyMapper olderHealthyMapper) {
		this.olderHealthyMapper = olderHealthyMapper;
	}

	

	public ArrayList<OlderHealthy> getAllXueTang(int old_id) {
		
		ArrayList<OlderHealthyOne> oderxt = olderHealthyMapper.getAllXueTang(old_id);
		ArrayList <OlderHealthy> oderxuetang=new ArrayList<OlderHealthy>();
		for (int i = 0; i < oderxt.size(); i++) {
			OlderHealthy olderHealthy=new OlderHealthy();
			
			oderxuetang.add(olderHealthy);
			oderxuetang.get(i).setHealth_xt(oderxt.get(i).getHealthy_num());
			oderxuetang.get(i).setHealth_xt_time(oderxt.get(i).getHealthy_time());
			
			
		}
		return oderxuetang;
	}

	public ArrayList<OlderHealthy> getAllXueYang(int old_id) {
		ArrayList<OlderHealthyOne> oderxy = olderHealthyMapper.getAllXueYang(old_id);
		ArrayList <OlderHealthy> oderxueyang=new ArrayList<OlderHealthy>();
		for (int i = 0; i < oderxy.size(); i++) {
			OlderHealthy olderHealthy=new OlderHealthy();
			
			oderxueyang.add(olderHealthy);
			oderxueyang.get(i).setHealth_xy(oderxy.get(i).getHealthy_num());
			oderxueyang.get(i).setHealth_xy_time(oderxy.get(i).getHealthy_time());
			
			
		}
		return oderxueyang;
	}




	public ArrayList<OlderHealthyOne> getAllMb(int old_id) {
		// TODO Auto-generated method stub
		return olderHealthyMapper.getAllMb(old_id);
	}




	public ArrayList<OlderHealthyOne> getAllSS(int old_id) {
		// TODO Auto-generated method stub
		return olderHealthyMapper.getAllSS(old_id);
	}




	public ArrayList<OlderHealthyOne> getAllSZ(int old_id) {
		// TODO Auto-generated method stub
		return olderHealthyMapper.getAllSZ(old_id);
	}
			
}

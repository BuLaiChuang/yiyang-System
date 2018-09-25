package com.medcare.older.service;

import java.util.ArrayList;

import com.medcare.older.pojo.OldRecord;
public interface RecordService
{
	//增加住院记录
	public void save();
	
	//删除住院记录
	public void delete();
	
	//修改住院记录
	public void update();
	
	//按照老人id查住院记录
	public ArrayList<OldRecord> findByOldId(int old_id);
	
	//按照住院名称查住院记录
	public ArrayList<OldRecord> findByHospital(String record_hospital);
	
	//添加住院记录
	public void addRecord(OldRecord oldrecord);
	
	//删除住院记录
	public boolean removeRecord(int id);
	
	//修改住院记录
	public void updateRecord(OldRecord oldrecord);
	
	//查询某条记录
	public OldRecord selectoneRecord(int record_id);

}

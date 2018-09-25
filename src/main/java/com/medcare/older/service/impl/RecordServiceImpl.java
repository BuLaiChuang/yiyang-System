package com.medcare.older.service.impl;

import java.util.ArrayList;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.medcare.older.mapper.RecordMapper;
import com.medcare.older.pojo.OldRecord;
import com.medcare.older.service.RecordService;

@Service("recordService")
public class RecordServiceImpl implements RecordService{
	
    private RecordMapper recordMapper;
	
	@Resource(name="recordMapper")
	public void setRecordMapper(RecordMapper recordMapper) {
		this.recordMapper = recordMapper;
	}

	@Override
	public void save() {
		
	}

	@Override
	public void delete() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public ArrayList<OldRecord> findByOldId(int old_id) {
		return  recordMapper.selectRecord(old_id);
	}

	@Override
	public ArrayList<OldRecord> findByHospital(String record_hospital) {
		return null;
	}

	@Override
	public void addRecord(OldRecord oldrecord) {
		recordMapper.addRecord(oldrecord);
	}

	@Override
    public boolean removeRecord(int id) {
		
		return recordMapper.removeRecord(id);
	}

	@Override
	public void updateRecord(OldRecord oldrecord) {
		recordMapper.updateRecord(oldrecord);
	}

	@Override
	public OldRecord selectoneRecord(int record_id) 
	{
		OldRecord oldrecord=recordMapper.selectoneRecord(record_id); 
		return oldrecord;
	}

	
}

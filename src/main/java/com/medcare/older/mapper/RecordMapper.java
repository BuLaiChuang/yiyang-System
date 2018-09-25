package com.medcare.older.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.medcare.older.pojo.OldRecord;
import com.medcare.older.pojo.UserLogin;

public interface RecordMapper 
{
	@Select("select * from t_record where old_id = #{old_id}")
	public ArrayList<OldRecord> selectRecord(int old_id);
	
	@Insert("insert into t_record(old_id,record_hospital,record_section,record_sickroom,record_number,record_starttime,record_endtime,record_describe) values (#{old_id},#{record_hospital},#{record_section},#{record_sickroom},#{record_number},#{record_starttime},#{record_endtime},#{record_describe})")
	public void addRecord(OldRecord oldrecord);
	
	@Delete("delete from t_record where record_id=#{record_id}")
	public boolean removeRecord(int record_id);
	
	@Update("update t_record set record_hospital=#{record_hospital},record_section=#{record_section},record_sickroom=#{record_sickroom},record_number=#{record_number},record_starttime=#{record_starttime},record_endtime=#{record_endtime},record_describe=#{record_describe} where record_id=#{record_id}")
	public void updateRecord(OldRecord oldrecord);
	
	@Select("select * from t_record where record_id = #{record_id}")
	public OldRecord selectoneRecord(int record_id);

}

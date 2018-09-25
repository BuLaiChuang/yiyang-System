package com.medcare.older.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medcare.older.pojo.Old;
import com.medcare.older.pojo.OldRecord;
import com.medcare.older.pojo.UserLogin;
import com.medcare.older.service.RecordService;
@Controller
public class OldRecordController 
{
   private RecordService recordService;
	
	@Resource(name="recordService")
	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}
	
	@RequestMapping("/selectAll")
	public ModelAndView selectAll(HttpSession session){
		ModelAndView mv = null;
		int user_id=(Integer) session.getAttribute("user_id");
		try
		{
			mv = new ModelAndView("show");
			ArrayList<OldRecord> oldrecords = recordService.findByOldId(user_id);
	
			mv.addObject("data", oldrecords);
			mv.setViewName("oldRecord");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("addRecord")
	@ResponseBody
	public String addRecord(OldRecord oldrecord) {
		String msg="1";
		try {
			recordService.addRecord(oldrecord);
			msg="0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	@RequestMapping("deleteRecord")
	@ResponseBody
	public String deleteRecord(int id) {
		String msg="1";
		System.out.println("hahaha");
		try {
			recordService.removeRecord(id);
			
			msg="0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	
	
	
	
	/**
	 * 修改用户信息
	 * @param oldrecord
	 * @return
	 */
	@RequestMapping("updateRecord")
	@ResponseBody
	public String updateRecord(OldRecord oldrecord) {
		System.out.println(oldrecord.getRecord_id());
		String msg="1";
		try {
			recordService.updateRecord(oldrecord);
			msg="0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return msg;
	}

	
//	@RequestMapping("/updateRecord")
//	public String  updateRecord(OldRecord oldrecord)
//	{
//		recordService.updateRecord(oldrecord);
//		return "oldRecord";
//	}

	/**
	 * @param record_id
	 * @return
	 * 编辑用户信息
	 */
	@RequestMapping("editRecord")
	@ResponseBody
	public OldRecord editRecord(Integer record_id) {
		OldRecord oldrecord=recordService.selectoneRecord(record_id);
		return oldrecord;
	}
	
	public OldRecord selectoneRecord(int record_id,HttpSession session){
		OldRecord oldrecord = null;
		ModelAndView mv = null;
		try
		{
			System.out.println("我是测验的");
			mv = new ModelAndView();
		    oldrecord = recordService.selectoneRecord(record_id);
		    mv.addObject("oldrecord", oldrecord);
			return oldrecord;
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return oldrecord;
	}

}

package com.medcare.older.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medcare.older.pojo.OlderHealthy;
import com.medcare.older.pojo.OlderHealthyValueInformation;
import com.medcare.older.pojo.OlderHealthyValueWarn;
import com.medcare.older.service.OlderHealthyService;
import com.medcare.older.service.OlderHealthyValueService;



@Controller
public class OlderHealthyValueController {
	
	@Autowired
	private OlderHealthyValueService olderHealthyValueService;
	
	
	
	@RequestMapping("/showAllValue")
	public ModelAndView showAllValue(int old_id){
		
		System.out.println(old_id);
		ModelAndView mv = null;
		try {
				mv = new ModelAndView("showAllValue");
				ArrayList<OlderHealthyValueInformation> allvalue = olderHealthyValueService.getAllValue(old_id);
		        
				mv.addObject("data",allvalue );
				
			   return mv;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	//删除一条预警阈值
	@RequestMapping("/removeOneValue")
	public ModelAndView removeOneValue(int value_information_id){
		int old_id=1;
		System.out.println(old_id);
		
		try {
				
				olderHealthyValueService.removeOneValue(old_id,value_information_id);
			   return showAllValue(old_id);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	//查询一条预警阈值
   @RequestMapping("edit")
   @ResponseBody
   public OlderHealthyValueInformation edit(int value_information_id) {
			OlderHealthyValueInformation olderHealthyValueInformation= olderHealthyValueService.getOneValue(value_information_id);
			System.out.println("查询");
			System.out.println(olderHealthyValueInformation.getValue_information_id());
			
			return olderHealthyValueInformation;

			}
   
   
   
   
   
//修改一条预警阈值
   
   
   /**
	 * 修改用户信息
	 * @param customer
	 * @return
	 */
	@RequestMapping("update")
	@ResponseBody
	public String update(OlderHealthyValueInformation olderOlderHealthyValueInformation) {
		
		String msg="1";
		try {
			System.out.println("修改");
			System.out.println(olderOlderHealthyValueInformation.getValue_max());
			System.out.println(olderOlderHealthyValueInformation.getValue_information_id());
			olderHealthyValueService.updateOneValue(olderOlderHealthyValueInformation);
			msg="0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return msg;
	}

	
	
	//查询出所有异常信息
	@RequestMapping("/getAllValueWarn")
	public ModelAndView getAllValueWarn(){
		int old_id=1;
		System.out.println(old_id);
		ModelAndView mv = null;
		try {
				
				olderHealthyValueService.getAllValueWarn(old_id);
				mv = new ModelAndView("showAllValueWarn");
				ArrayList<OlderHealthyValueWarn> allvaluewarn = olderHealthyValueService.getAllValueWarn(old_id);
				 
				
				
				for (int i = 0; i < allvaluewarn.size(); i++) {
					
					allvaluewarn.get(i).setWarn(allvaluewarn.get(i).toString());
					
				}
				
				
				
				mv.addObject("data",allvaluewarn );
		
			   return mv;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	
	//处理一条异常信息
	@RequestMapping("/handleOneValueWarn")
	public ModelAndView handleOneValueWarn(int healthy_id){
		int old_id=1;
		System.out.println(old_id);
		System.out.println(healthy_id);
		
		try {
				
				olderHealthyValueService.headleValueWarn(old_id,healthy_id);
			   return getAllValueWarn();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
}

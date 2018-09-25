package com.medcare.older.controller;

import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.medcare.older.pojo.OlderHealthy;
import com.medcare.older.pojo.OlderHealthyOne;
import com.medcare.older.service.OlderHealthyService;


@Controller
public class OlderHealthyController {
	
	private OlderHealthyService olderHealthyService;
	
	@Resource(name="olderHealthyService")
	public void setUserService(OlderHealthyService olderHealthyService) {
		this.olderHealthyService = olderHealthyService;
	}
	
	
	@RequestMapping("/showXueYa")
	public ModelAndView showXueYa(int old_id){
		System.out.println(old_id);
		String XueYasz = "";
		String XueYass = "";
		String XueYamb = "";
		String XueYambtime="";
		ModelAndView mv = null;
		try {
				mv = new ModelAndView("showXueYa");
				ArrayList<OlderHealthyOne> odermb = olderHealthyService.getAllMb(old_id);
				ArrayList<OlderHealthyOne> odersz = olderHealthyService.getAllSZ(old_id);
				ArrayList<OlderHealthyOne> oderss = olderHealthyService.getAllSS(old_id);
				ArrayList <OlderHealthy> oderxueya=new ArrayList<OlderHealthy>();
				for (int i = 0; i < odermb.size(); i++) {
					OlderHealthy olderHealthy=new OlderHealthy();
					oderxueya.add(olderHealthy);
					
					
				}
				for (int i = 0; i < odermb.size(); i++) {
					oderxueya.get(i).setHealth_mb(odermb.get(i).getHealthy_num());
					oderxueya.get(i).setHealth_sz(odersz.get(i).getHealthy_num());
					oderxueya.get(i).setHealth_ss(oderss.get(i).getHealthy_num());
					oderxueya.get(i).setHealth_mb_time(odermb.get(i).getHealthy_time());
					
				}
				
				for (int i = 0; i <oderxueya.size() ; i++)
	            {   OlderHealthy olderHealthya=oderxueya.get(i);
	                XueYasz += olderHealthya.getHealth_sz();
	                if (i != oderxueya.size() - 1)
	                {
	                	XueYasz += ",";
	                }
	            }
				for (int i = 0; i <oderxueya.size() ; i++)
	            {   OlderHealthy olderHealthya=oderxueya.get(i);
	            XueYambtime += "'";
	            XueYambtime += olderHealthya.getHealth_mb_time();
	            XueYambtime += "'";
	                if (i != oderxueya.size() - 1)
	                {
	                	XueYambtime += ",";
	                }
	            }
				for (int i = 0; i <oderxueya.size() ; i++)
	            {   OlderHealthy olderHealthya=oderxueya.get(i);
	     
	            XueYass += olderHealthya.getHealth_ss();
	         
	                if (i != oderxueya.size() - 1)
	                {
	                	XueYass += ",";
	                }
	            }
				for (int i = 0; i <oderxueya.size() ; i++)
	            {   OlderHealthy olderHealthya=oderxueya.get(i);
	     
	            XueYamb += olderHealthya.getHealth_mb();
	         
	                if (i != oderxueya.size() - 1)
	                {
	                	XueYamb += ",";
	                }
	            }
				mv.addObject("XueYambtime", XueYambtime);
				mv.addObject("data", oderxueya);
				mv.addObject("XueYasz", XueYasz);
				mv.addObject("XueYass", XueYass);
				mv.addObject("XueYamb", XueYamb);
			   return mv;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/showXueTang")
	public ModelAndView showXueTang(int old_id){
		System.out.println(old_id);
		String XueTang="";
		ModelAndView mv = null;
		try {
				mv = new ModelAndView("showXueTang");
				ArrayList<OlderHealthy> oderxuetang = olderHealthyService.getAllXueTang(old_id);
				for (int i = 0; i <oderxuetang.size() ; i++)
	            {   OlderHealthy olderHealthya=oderxuetang.get(i);
	                XueTang += olderHealthya.getHealth_xt();
	                if (i != oderxuetang.size() - 1)
	                {
	                	XueTang += ",";
	                }
	            }
				mv.addObject("data", oderxuetang);
				mv.addObject("XueTang", XueTang);
			   return mv;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	@RequestMapping("/showXueYang")
	public ModelAndView showXueYang(int old_id){
		System.out.println(old_id);
		ModelAndView mv = null;
		String XueYang = "";
		String XueYangtime="";
		try {
				mv = new ModelAndView("showXueYang");
				ArrayList<OlderHealthy> oderxueyang = olderHealthyService.getAllXueYang(old_id);
				for (int i = 0; i <oderxueyang.size() ; i++)
	            {   OlderHealthy olderHealthya=oderxueyang.get(i);
	                XueYang += olderHealthya.getHealth_xy();
	                if (i != oderxueyang.size() - 1)
	                {
	                	XueYang += ",";
	                }
	            }
				for (int i = 0; i <oderxueyang.size() ; i++)
	            {   OlderHealthy olderHealthya=oderxueyang.get(i);
	            XueYangtime += "'";
	            XueYangtime += olderHealthya.getHealth_xy_time();
	            XueYangtime += "'";
	                if (i != oderxueyang.size() - 1)
	                {
	                	XueYangtime += ",";
	                }
	            }
				mv.addObject("data", oderxueyang);
				mv.addObject("XueYang", XueYang);
				mv.addObject("XueYangtime",XueYangtime);
			   return mv;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
}

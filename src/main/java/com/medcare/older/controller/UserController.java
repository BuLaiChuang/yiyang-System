package com.medcare.older.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.medcare.older.pojo.Old;
import com.medcare.older.pojo.UserInf;
import com.medcare.older.pojo.UserLogin;
import com.medcare.older.service.UserService;


@Controller
public class UserController {

	private UserService userService;
	
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
    
	@RequestMapping("regist")
	public String regist(UserLogin user,Model model){
		userService.regist(user);
		
		model.addAttribute("msg", "注册成功");
		//注册成功后跳转success.jsp页面
		return "loginForm";
	}
	
	@RequestMapping("perfect")
	public String  perfect(Old older,Model model){
		userService.perfect(older);
		model.addAttribute("msg", "信息完善完毕");
		return "success";
	}


	@RequestMapping(value="/login")
    public ModelAndView login(String user_name,String user_password,ModelAndView mv,HttpSession session){
        UserLogin user=userService.login(user_name, user_password);
        if(user!=null){
            //登录成功，将user对象设置到HttpSession作用范围域中
            session.setAttribute("user", user);
            session.setAttribute("user_id", user.getUser_login_id());
            //转发到main请求
            mv.setViewName("main");
        }else {
            //登录失败，设置失败信息，并调转到登录页面
            
            mv.addObject("message","登录名和密码错误，请重新输入");
            mv.setViewName("loginForm");
        }
        return mv;
    }
	
}

package com.hpt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hpt.bean.AdminInfo;
import com.hpt.biz.IAdminInfoBiz;

@Controller
@RequestMapping("/admin")
public class AdminInfoController {
	@Autowired
	IAdminInfoBiz biz;
	

	
	@RequestMapping("/login")
	@ResponseBody
	public int login(AdminInfo af, HttpSession session) {
		AdminInfo AdminInfo = biz.login(af);
		
		if (AdminInfo != null) {
			session.setAttribute("currentAdmin", af);
			return 1;
		}
		
		return 0;
	}
}

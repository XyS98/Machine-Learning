package com.hpt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/backjump")
public class backJumpController { // 后台部分的页面跳转

	@RequestMapping("/login")
	public String getlogin() {
		return "backlogin";
	}
	
	
	@RequestMapping("/MenberManner")
	public String menberManner() {
		return "back/MenberManner";
	}
	
	@RequestMapping("/Taskexamine")
	public String Taskexamine() {
		return "back/Taskexamine";
	}
	
	@RequestMapping("/TaskManner")
	public String TaskManner() {
		return "back/TaskManner";
	}
	
	@RequestMapping("/SkillManner")
	public String SkillManner() {
		return "back/SkillManner";
	}
	
	@RequestMapping("/WorkItemMannner")
	public String WorkItemMannner() {
		return "back/WorkItemMannner";
	}
	
	@RequestMapping("/WorkTypeManner")
	public String WorkTypeManner() {
		return "back/WorkTypeManner";
	}
	
	@RequestMapping("/index")
	public String manner() {
		return "back/index";
	}
	
	@RequestMapping("/addindustry")
	public String addindustry() {
		return "back/addindustry";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "back/test";
	}
	
	@RequestMapping("/TaskDetail")
	public String TaskDetail() {
		return "back/TaskDetail";
	}
	@RequestMapping("/WorkManner")
	public String WorkManner() {
		return "back/WorkManner";
	}
	
	@RequestMapping("/BillShow")
	public String BillShow() {
		return "back/BillShow";
	}
	@RequestMapping("/SelectDetail")
	public String SelectDetail() {
		return "back/SelectDetail";
	}
	@RequestMapping("/SelectedManner")
	public String SelectedManner() {
		return "back/SelectedManner";
	}
	@RequestMapping("/ReleaseTask")
	public String ReleaseTask() {
		return "ReleaseTask";
	}
	

}

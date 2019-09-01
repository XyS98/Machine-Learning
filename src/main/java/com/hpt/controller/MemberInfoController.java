package com.hpt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hpt.bean.MemberInfo;
import com.hpt.bean.TableLayUI;
import com.hpt.bean.Task;
import com.hpt.biz.IMemberInfoBiz;

@Controller
@RequestMapping("/member")
public class MemberInfoController {
	@Autowired
	IMemberInfoBiz biz;

	
	@RequestMapping("/finds")
	@ResponseBody
	public String finds(HttpSession session, HttpServletRequest request) {
		/*
		 * 页数和每页数据数量
		 */
		int page = Integer.valueOf( request.getParameter("page"));
		int limit = Integer.valueOf( request.getParameter("limit"));
		String name =  request.getParameter("name");
		
		/*
		 * 类型编号 用于分类查询
		 */
	
		List<Task> data = new ArrayList<Task>(); // 存放查得的数据
		Gson gson = new Gson(); // 转就送用
		
		/**
		 * table json 的一些数据
		 */
		int code = 0;
		String msg = "";
		int count = 0;
		
		TableLayUI table ; // 放需要的数据 
		
		/**
		 * 分页查询用 
		 */
		int min = (page - 1) * limit;
		int max = page * limit;
		MemberInfo mb = new MemberInfo();
		
		mb.setMno(min);
		mb.setStatus(max);
		if (name !="" || name != null) {
			mb.setNickName(name);
		}
		data = biz.finds(mb);
		
		count = biz.findcount(mb);
		
		table = new TableLayUI(code, msg, count, data);
		String result  = gson.toJson(table);
		return result;
	}
	
}

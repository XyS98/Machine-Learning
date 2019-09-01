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
import com.hpt.bean.Skill;
import com.hpt.bean.TableLayUI;
import com.hpt.bean.Task;
import com.hpt.bean.WorksItem;
import com.hpt.biz.ISkillBiz;

@Controller
@RequestMapping("/skill")
public class SkillController {
	@Autowired
	ISkillBiz biz;

	@RequestMapping("/finds")
	@ResponseBody
	public String  finds(HttpSession session, HttpServletRequest request) {
		/*
		 * 页数和每页数据数量
		 */
		int page = Integer.valueOf( request.getParameter("page"));
		int limit = Integer.valueOf( request.getParameter("limit"));
		int mno = Integer.valueOf( request.getParameter("mno"));
		
		/*
		 * 类型编号 用于分类查询
		 */
		List<Skill> data = new ArrayList<Skill>(); // 存放查得的数据
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
		Skill sk = new Skill();
		sk.setSkno(min);
		sk.setWino(max);
		sk.setMno(mno);
		System.out.println(sk);
		data = biz.finds(sk);
		count = biz.findcount(sk);
		
		table = new TableLayUI(code, msg, count, data);
		String result  = gson.toJson(table);
		return result;
	}
	
}

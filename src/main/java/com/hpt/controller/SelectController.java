package com.hpt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hpt.bean.Selected;
import com.hpt.bean.TableLayUI;
import com.hpt.bean.Task;
import com.hpt.bean.TimeList;
import com.hpt.bean.WorksItem;
import com.hpt.biz.ISelectedBiz;
import com.hpt.biz.ITaskBiz;
import com.hpt.biz.IWorksItemBiz;

@Controller
@RequestMapping("/selected")
public class SelectController {
	@Autowired
	ISelectedBiz biz;

	
	@RequestMapping("/finds")
	@ResponseBody
	public String  finds(HttpServletRequest request) {
		/*
		 * 页数和每页数据数量
		 */
		int page = Integer.valueOf( request.getParameter("page"));
		int limit = Integer.valueOf( request.getParameter("limit"));
		int mno = Integer.valueOf( request.getParameter("mno"));
		
		
		List<Selected> data = new ArrayList<Selected>(); // 存放查得的数据
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
		Selected se = new Selected();
		se.setSbno(min);
		se.setIsselected(max);;
		se.setMno(mno);
		data = biz.finds(se);
		count = biz.findcount(se);
		
		table = new TableLayUI(code, msg, count, data);
		String result  = gson.toJson(table);
		return result;
	}
	@RequestMapping("/findOne")
	@ResponseBody
	public Selected  findOne(HttpServletRequest request) {
		int sbno = Integer.valueOf( request.getParameter("sbno"));
		Selected se = new Selected();
		se.setSbno(sbno);
		Selected data = new Selected();
		data = biz.findOne(se);
		return data;
		
	}
	
	
}

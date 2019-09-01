package com.hpt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hpt.bean.Industry;
import com.hpt.bean.TableLayUI;
import com.hpt.bean.Works;
import com.hpt.bean.WorksItem;
import com.hpt.biz.IWorksItemBiz;

@Controller
@RequestMapping("/workItem")
public class WorkItemrController {
	@Autowired
	IWorksItemBiz biz;

	
	@RequestMapping("/finds")
	@ResponseBody
	public String  finds(HttpSession session, HttpServletRequest request) {
		/*
		 * 页数和每页数据数量
		 */
		int page = Integer.valueOf( request.getParameter("page"));
		int limit = Integer.valueOf( request.getParameter("limit"));
		
		/*
		 * 职业编号和工作编号 用于分类查询
		 */
		int indno = Integer.valueOf( request.getParameter("indno"));
		int wno = Integer.valueOf( request.getParameter("wno"));
		System.out.println(wno);
		List<WorksItem> data = new ArrayList<WorksItem>(); // 存放查得的数据
		Gson gson = new Gson(); // 转就送用
		
		/**
		 * table json 的一些数据
		 */
		int code = 0;
		String msg = "";
		int count = 0;
		
		TableLayUI table ; // 放需要的数据 
		
		/**
		 * 分页查询用 并用wno 放min wino放max
		 */
		int min = (page - 1) * limit;
		int max = page * limit;
		WorksItem ws = new WorksItem();
		ws.setMno(min);
		ws.setWino(max);
		
		/**
		 * 
		 */
		if (indno != -1) {
			ws.setIndno(indno);
		}
		if (wno != -1) {
			ws.setWno(wno);
		}
		
		data = biz.finds(ws);
		count = biz.findcount(ws);
		
		table = new TableLayUI(code, msg, count, data);
		String result  = gson.toJson(table);
		return result;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public int  add(WorksItem wi) {
		return biz.add(wi);
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public int  del(WorksItem wi) {
		return biz.del(wi);
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<WorksItem>  findAll(WorksItem wi) {
		return biz.findAll(wi);
	}
}

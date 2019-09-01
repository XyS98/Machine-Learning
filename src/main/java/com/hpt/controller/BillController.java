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
import com.hpt.bean.BillShow;
import com.hpt.bean.WorksItem;
import com.hpt.biz.IBillBiz;

@Controller
@RequestMapping("/bill")
public class BillController {
	@Autowired
	IBillBiz biz;
//	{"day":"1月","in":2.6,"out":2.0}
	@RequestMapping("/fbyd")
	@ResponseBody
	public List<BillShow>  finds(HttpSession session, HttpServletRequest request) {
		int year = Integer.valueOf( request.getParameter("year"));
		int mon = Integer.valueOf( request.getParameter("mon"));
		int mno = Integer.valueOf( request.getParameter("mno"));
		
		List<BillShow> data = new ArrayList<BillShow>(); // 存放查得的数据
		Gson gson = new Gson(); // 转就送用

		BillShow bs = new BillShow();
		
		bs.setYear(year);
		bs.setMon(mon);
		if (mno >= 0) {
			bs.setMno(mno);
		}
		data = biz.finds(bs);
		
		//String result  = gson.toJson(data);
		return data;
	}
	@RequestMapping("/findYear")
	@ResponseBody
	public List<Integer>  findYear() {
		List<Integer> data = new ArrayList<Integer>(); 
		data = biz.findYear();
		
		//String result  = gson.toJson(data);
		return data;
	}
	
}

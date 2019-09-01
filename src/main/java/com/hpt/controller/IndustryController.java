package com.hpt.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hpt.bean.Industry;
import com.hpt.biz.IIndustryBiz;


@Controller
@RequestMapping("/industry")
public class IndustryController {
	@Autowired
	IIndustryBiz biz;

	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Industry>  findAll(Industry id) {
		return biz.findAll(id);
	}
	@RequestMapping("/add")
	@ResponseBody
	public int  add(Industry id) {
		return biz.add(id);
	}
	@RequestMapping("/del")
	@ResponseBody
	public int  del(Industry id) {
		return biz.del(id);
	}
}

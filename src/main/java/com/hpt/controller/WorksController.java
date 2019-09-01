package com.hpt.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hpt.bean.Works;
import com.hpt.bean.WorksItem;
import com.hpt.biz.IWorksBiz;

@Controller
@RequestMapping("/works")
public class WorksController {
	@Autowired
	IWorksBiz biz;

	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Works>  findAll(Works wo) {
		return biz.findAll(wo);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public int  add(Works wo) {
		return biz.add(wo);
	}
	@RequestMapping("/del")
	@ResponseBody
	public int  del(Works wo) {
		return biz.del(wo);
	}
}

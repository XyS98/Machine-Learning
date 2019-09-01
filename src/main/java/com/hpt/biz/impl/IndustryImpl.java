package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.Industry;
import com.hpt.biz.IIndustryBiz;
import com.hpt.mapper.IIndustryMapper;

@Service
public class IndustryImpl implements IIndustryBiz {
	
	@Autowired
	IIndustryMapper mapper;
	
	public List<Industry> findAll(Industry id) {
		return mapper.findAll(id);
	}

	@Override
	public int add(Industry id) {
		return mapper.add(id);
	}

	@Override
	public int del(Industry id) {
		return mapper.del(id);
	}
}

package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.Works;
import com.hpt.biz.IWorksBiz;
import com.hpt.mapper.IWorksMapper;

@Service
public class WorksImpl implements IWorksBiz {
	
	@Autowired
	IWorksMapper mapper;
	
	public List<Works> findAll(Works wo) {
		return mapper.findAll(wo);
	}

	@Override
	public int add(Works wo) {
		return mapper.add(wo);
	}

	@Override
	public int del(Works wo) {
		return mapper.del(wo);

	}
}

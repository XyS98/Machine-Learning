package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.WorksItem;
import com.hpt.biz.IWorksItemBiz;
import com.hpt.mapper.IWorksItemMapper;

@Service
public class WorksItemImpl implements IWorksItemBiz {

	@Autowired
	IWorksItemMapper mapper;
	@Override
	public List<WorksItem> finds(WorksItem wi) {
		return mapper.finds(wi);
	}
	@Override
	public int findcount(WorksItem wi) {
		return mapper.findcount(wi);
	}
	@Override
	public int add(WorksItem wi) {
		return mapper.add(wi);
	}
	@Override
	public int del(WorksItem wi) {
		return mapper.del(wi);
	}
	@Override
	public List<WorksItem> findAll(WorksItem wi) {
		return mapper.findAll(wi);
	}
}

package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.Selected;
import com.hpt.biz.ISelectedBiz;
import com.hpt.mapper.ISelectedMapper;

@Service
public class SelectedImpl implements ISelectedBiz {
	
	@Autowired
	ISelectedMapper mapper;
	
	@Override
	public int findcount(Selected se) {
		return mapper.findcount(se);
	}

	@Override
	public List<Selected> finds(Selected se) {
		return mapper.finds(se);
	}

	@Override
	public Selected findOne(Selected se) {
		return mapper.findOne(se);
	}

}

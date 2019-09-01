package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.MemberInfo;
import com.hpt.bean.Task;
import com.hpt.biz.IMemberInfoBiz;
import com.hpt.mapper.IMemberInfoMapper;

@Service
public class MemberInfoImpl implements IMemberInfoBiz{
	
	@Autowired
	IMemberInfoMapper mapper;
	@Override
	public int findcount(MemberInfo mb) {
		return mapper.findcount(mb);
	}

	@Override
	public List<Task> finds(MemberInfo mb) {
		return mapper.finds(mb);
	}

}

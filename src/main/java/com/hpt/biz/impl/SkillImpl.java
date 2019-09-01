package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.Skill;
import com.hpt.biz.ISkillBiz;
import com.hpt.mapper.ISkillMapper;

@Service
public class SkillImpl implements ISkillBiz{
	
	@Autowired
	ISkillMapper mapper;
	@Override
	public int findcount(Skill sk) {
		// TODO Auto-generated method stub
		return mapper.findcount(sk);
	}

	@Override
	public List<Skill> finds(Skill sk) {
		// TODO Auto-generated method stub
		return mapper.finds(sk);
	}

}

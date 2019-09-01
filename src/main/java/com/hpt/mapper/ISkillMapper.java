package com.hpt.mapper;

import java.util.List;

import com.hpt.bean.Skill;

public interface ISkillMapper  {
	public int findcount(Skill sk);

	public List<Skill> finds(Skill sk);
	

}

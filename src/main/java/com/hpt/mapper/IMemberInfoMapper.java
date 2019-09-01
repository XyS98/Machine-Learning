package com.hpt.mapper;

import java.util.List;

import com.hpt.bean.MemberInfo;
import com.hpt.bean.Task;

public interface IMemberInfoMapper {

	public int findcount(MemberInfo mb);

	public List<Task> finds(MemberInfo mb);
	
}

package com.hpt.biz;

import java.util.List;

import com.hpt.bean.MemberInfo;
import com.hpt.bean.Task;
import com.hpt.bean.WorksItem;

public interface IMemberInfoBiz {

	public int findcount(MemberInfo mb);

	public List<Task> finds(MemberInfo mb);
	
	
}

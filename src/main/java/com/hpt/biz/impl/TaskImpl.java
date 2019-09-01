package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hpt.bean.Task;
import com.hpt.bean.TimeList;
import com.hpt.biz.ITaskBiz;
import com.hpt.mapper.ITaskMapper;

@Service
public class TaskImpl implements ITaskBiz{
	
	@Autowired
	ITaskMapper mapper;
	@Override
	public int findcount(Task ta) {
		return mapper.findcount(ta);
	}

	@Override
	public List<Task> finds(Task ta) {
		return mapper.finds(ta);
	}

	@Override
	public Task findOne(Task ta) {
		return mapper.findOne(ta);
	}

	@Override
	public TimeList findList(TimeList ta) {
		return mapper.findList(ta);
	}

	@Override
	public int nopass(Task ta) {
		return mapper.nopass(ta);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 36000,rollbackFor = Exception.class)
	public int pass(Task ta) {
		
			try {
				mapper.pass(ta);
				TimeList tl = new TimeList();
				tl.setTno(ta.getTno());
				mapper.setList(tl);
			} catch (Exception e) {
				e.printStackTrace();
				return -1;
			} 
		
		return 1;
	}


}

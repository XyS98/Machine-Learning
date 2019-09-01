package com.hpt.mapper;

import java.util.List;

import com.hpt.bean.Task;
import com.hpt.bean.TimeList;

public interface ITaskMapper  {
	public int findcount(Task ta);

	public List<Task> finds(Task ta);
	public Task findOne(Task ta);
	public TimeList findList(TimeList ta);
	
	public int setList(TimeList ta);
	public int nopass(Task ta);
	
	public int pass(Task ta);

}

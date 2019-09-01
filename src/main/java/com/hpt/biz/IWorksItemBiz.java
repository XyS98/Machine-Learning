package com.hpt.biz;

import java.util.List;

import com.hpt.bean.WorksItem;

public interface IWorksItemBiz {

		public List<WorksItem> finds(WorksItem wi) ;

		public int findcount(WorksItem wi);
		
		public int add(WorksItem wi) ;
		
		public int del(WorksItem wi) ;

		public List<WorksItem> findAll(WorksItem wi);
	}

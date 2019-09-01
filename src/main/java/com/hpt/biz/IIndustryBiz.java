package com.hpt.biz;

import java.util.List;

import com.hpt.bean.Industry;

public interface IIndustryBiz {
	public List<Industry> findAll(Industry id);
	public int add(Industry id);
	public int  del(Industry id);
}

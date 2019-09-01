package com.hpt.biz;

import java.util.List;

import com.hpt.bean.Works;
import com.hpt.bean.WorksItem;

public interface IWorksBiz {
	public List<Works> findAll(Works wo);
	public int add(Works wo);
	public int del(Works wo);

}

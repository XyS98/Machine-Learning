package com.hpt.mapper;

import java.util.List;

import com.hpt.bean.Works;

public interface IWorksMapper {
	public List<Works> findAll(Works wo);
	public int add(Works wo);
	public int del(Works wo);
}

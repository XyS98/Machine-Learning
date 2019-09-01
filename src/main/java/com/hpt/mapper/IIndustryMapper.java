package com.hpt.mapper;

import java.util.List;

import com.hpt.bean.Industry;

public interface IIndustryMapper {
	public List<Industry> findAll(Industry id);
	public int add(Industry id);
	public int del(Industry id);
}

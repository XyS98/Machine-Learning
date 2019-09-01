package com.hpt.mapper;

import java.util.List;

import com.hpt.bean.Selected;

public interface ISelectedMapper {

	public int findcount(Selected se);

	public List<Selected> finds(Selected se);

	public Selected findOne(Selected se);
}

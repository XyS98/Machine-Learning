package com.hpt.mapper;

import java.util.List;

import com.hpt.bean.BillShow;

public interface IBillMapper  {
	public List<BillShow> finds(BillShow bs);

	public List<Integer> findYear();
	
}

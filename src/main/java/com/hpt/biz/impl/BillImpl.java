package com.hpt.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.BillShow;
import com.hpt.biz.IBillBiz;
import com.hpt.mapper.IBillMapper;

@Service
public class BillImpl implements IBillBiz {

	@Autowired
	IBillMapper mapper;
	
	@Override
	public List<BillShow> finds(BillShow bs) {
		return mapper.finds(bs);
	}

	@Override
	public List<Integer> findYear() {
		// TODO Auto-generated method stub
		return mapper.findYear();
	}

}

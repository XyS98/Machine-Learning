package com.hpt.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.bean.AdminInfo;
import com.hpt.biz.IAdminInfoBiz;
import com.hpt.mapper.IAdminInfoMapper;
@Service	
public class AdminInfoImpl implements IAdminInfoBiz{

	@Autowired
	IAdminInfoMapper mapper;
	
	@Override
	public AdminInfo login(AdminInfo af) {
		
		return mapper.login(af);
	}

}

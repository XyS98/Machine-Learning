package com.hpt.biz;

import java.util.List;

import com.hpt.bean.BillShow;

public interface IBillBiz {

	List<BillShow> finds(BillShow bs);

	List<Integer> findYear();

}

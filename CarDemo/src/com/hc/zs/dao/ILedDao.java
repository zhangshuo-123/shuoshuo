package com.hc.zs.dao;

import java.util.List;

import com.hc.zs.bean.Led;



public interface ILedDao {

	//故障灯查询
	List<Led> QueryLedLimit(int nowpage);
}

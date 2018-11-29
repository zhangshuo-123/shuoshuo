package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Led;

public interface ILedService {
	
	//故障灯查询
	List<Led> QueryLedLimit(int nowpage);
}

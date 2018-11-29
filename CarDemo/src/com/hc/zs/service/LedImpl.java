package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Led;
import com.hc.zs.dao.ILedDao;
import com.hc.zs.dao.LedDaoImpl;


public class LedImpl implements ILedService {
	//故障灯查询
	private ILedDao dao;
	public LedImpl() {
		if (dao==null) {
			dao=new LedDaoImpl();
		}
	}
	
	@Override
	public List<Led> QueryLedLimit(int nowpage) {
		
		return dao.QueryLedLimit(nowpage);
	}

	
	
}

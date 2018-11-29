package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Arctic;
import com.hc.zs.dao.ArcticDaoImpl;
import com.hc.zs.dao.IArcticDao;


public class ArcticImpl implements IArcticService {
	private  IArcticDao dao;

	public ArcticImpl() {
		if (dao==null) {
			dao=new ArcticDaoImpl();
		}
	}
	//查询车型
	@Override
	public List<Arctic> QueryArcticLimit(int nowpage) {
		// TODO Auto-generated method stub
		return dao.QueryArcticLimit(nowpage);
	}
	//新增车型
	@Override
	public boolean InsertArctic(String arctic, String cmoney, String cTime, String arcperson) {
		// TODO Auto-generated method stub
		return dao.InsertArctic(arctic, cmoney, cTime, arcperson);
	}
	//删除车型
	@Override
	public boolean DeleteArcticById(int cID) {
		// TODO Auto-generated method stub
		return dao.DeleteArcticById(cID);
	}
	//修改车型
	@Override
	public boolean UpdateArctic(int cID, String arctic, String cmoney, String cTime, String arcperson) {
		// TODO Auto-generated method stub
		return dao.UpdateArctic(cID, arctic, cmoney, cTime, arcperson);
	}
	@Override
	public int QueryCount() {
		// TODO Auto-generated method stub
		return dao.QueryCount();
	}

	
	

}

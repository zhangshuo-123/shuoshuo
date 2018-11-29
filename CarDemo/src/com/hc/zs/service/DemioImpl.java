package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Demio;

import com.hc.zs.dao.IDemioDao;
import com.hc.zs.dao.DemioDaoImpl;

public class DemioImpl implements IDemioService {
	private IDemioDao dao;

	public DemioImpl() {
		if (dao==null) {
			dao=new DemioDaoImpl();
		}
	}


	//查询车系分页
	@Override
	public List<Demio> QueryDemioLimit(int nowpage) {
		// TODO Auto-generated method stub
		return dao.QueryDemioLimit(nowpage);
	}
	//查询车系条数

	@Override
	public int QueryCount() {
		// TODO Auto-generated method stub
		return dao.QueryCount();
	}
	//新增车系

	@Override
	public boolean InsertDemio(String amg, String money, String dTime, String demperson) {
		// TODO Auto-generated method stub
		return dao.InsertDemio(amg, money, dTime, demperson);
	}

	//删除车系
	@Override
	public boolean DeleteDemioById(int dID) {
		// TODO Auto-generated method stub
		return dao.DeleteDemioById(dID);
	}
	
	//修改车系
	@Override
	public boolean UpdateDemio(int dID, String amg, String money, String dTime, String demperson) {
		// TODO Auto-generated method stub
		return dao.UpdateDemio(dID, amg, money, dTime, demperson);
		
	}

    //查询车系名字
	@Override
	public List<Demio> QueryDemioNames() {
		// TODO Auto-generated method stub
		return dao.QueryDemioNames();
	}





	
}

package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Staff;
import com.hc.zs.dao.StaffDaoImpl;
import com.hc.zs.service.IStaffService;

public class StaffImpl implements IStaffService {
	
	private StaffDaoImpl dao;

	public StaffImpl() {
		if (dao==null) {
			dao=new StaffDaoImpl();
		}
	}
	
	//登录系统
	@Override
	public Staff checklogin(String name, String password) {
		// TODO Auto-generated method stub
		return dao.checklogin(name, password);
	}

	// 删除人员
	@Override
	public boolean DeleteStaffById(int pID) {
		return dao.DeleteStaffById(pID);
	}

	//查询人员分页
	@Override
	public List<Staff> QueryStaffLimit(int nowpage) {
		// TODO Auto-generated method stub
		return dao.QueryStaffLimit(nowpage);
	}

    // 查询人员数量
	@Override
	public int QueryCount() {
		// TODO Auto-generated method stub
		return dao.QueryCount();
	}





}

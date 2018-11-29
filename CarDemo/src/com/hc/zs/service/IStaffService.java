package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Staff;

public interface IStaffService {

	// 登录系统
	Staff checklogin(String name, String password);

	// 新增人员


	// 删除人员
	boolean DeleteStaffById(int pID);
    
	//查询人员分页
	List<Staff> QueryStaffLimit(int nowpage);

    // 查询人员数量
	int QueryCount();
	
	
}

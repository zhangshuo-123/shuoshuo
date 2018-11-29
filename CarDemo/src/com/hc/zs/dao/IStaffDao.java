package com.hc.zs.dao;

import java.util.List;

import com.hc.zs.bean.Staff;

public interface IStaffDao {

	// 登录系统
	Staff checklogin(String name, String password);

	// 新增人员
	// 查询人员分页
	List<Staff> QueryStaffLimit(int nowpage);

	// 查询人员数量
	int QueryCount();

}

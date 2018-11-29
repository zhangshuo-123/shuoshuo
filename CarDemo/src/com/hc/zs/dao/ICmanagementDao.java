package com.hc.zs.dao;

import java.util.List;

import com.hc.zs.bean.Cmanagement;

public interface ICmanagementDao {
     //查询客户分页
	List<Cmanagement> QueryCmanagementLimit(int nowpage);
     //查询条数
	int QueryCount();
	//删除
	boolean DeleteCmanagementById(int customerID);
	//修改
	boolean UpdateCmanagement(Cmanagement cmanagement);

}

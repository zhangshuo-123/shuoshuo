package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Cmanagement;

public interface ICmanagementService {
    //查询客户分页
	List<Cmanagement> QueryCmanagementLimit(int nowpage);

    //查询客户条数
	int QueryCount();
    //删除客户 
	boolean DeleteCmanagementById(int customerID);
    //修改客户信息
	boolean UpdateCmanagement(Cmanagement cmanagement);


}

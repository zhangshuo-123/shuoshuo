package com.hc.zs.service;


import java.util.List;

import com.hc.zs.bean.Demio;
import com.hc.zs.bean.Staff;

public interface IDemioService {

	//查询车系
	List<Demio> QueryDemioLimit(int nowpage);
	//查询车系条数
	int QueryCount();
	//新增车系
	boolean InsertDemio(String amg, String money, String dTime, String demperson);
	//删除车系
	boolean DeleteDemioById(int dID);
	//修改车系
	boolean UpdateDemio(int dID, String amg, String money, String dTime, String demperson);
	//查询车系名字
	List<Demio> QueryDemioNames();


}

package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Arctic;

public interface IArcticService {
	//查询车型
    List<Arctic> QueryArcticLimit(int nowpage);
    
    int QueryCount();
	//新增车型
    boolean InsertArctic(String arctic, String cmoney, String cTime, String arcperson);
	//删除车型
    boolean DeleteArcticById(int cID);
	//修改车型
    boolean UpdateArctic(int cID, String arctic, String cmoney, String cTime, String arcperson); 
}

package com.hc.zs.service;

import java.util.List;

import com.hc.zs.bean.Cmanagement;
import com.hc.zs.dao.CmanagementDaoImpl;
import com.hc.zs.dao.ICmanagementDao;


public class CmanagementImpl implements ICmanagementService {
	private static final String Cmanagement = null;
	private ICmanagementDao dao;

	public CmanagementImpl() {
		if (dao==null) {
			dao=new CmanagementDaoImpl();
		}
	}

	 
	@Override
	public List<Cmanagement> QueryCmanagementLimit(int nowpage) {
		// TODO Auto-generated method stub
		return dao.QueryCmanagementLimit(nowpage) ;
	}

	@Override
	public int QueryCount() {
		// TODO Auto-generated method stub
		return dao.QueryCount();
	}

	@Override
	public boolean DeleteCmanagementById(int customerID) {
		// TODO Auto-generated method stub
		return dao.DeleteCmanagementById(customerID);
	}


	@Override
	public boolean UpdateCmanagement(Cmanagement cmanagement) {
		// TODO Auto-generated method stub
		return dao.UpdateCmanagement(cmanagement);
	}



}

package com.hc.zs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hc.zs.bean.Cmanagement;
import com.hc.zs.db.DBUtils;

public class CmanagementDaoImpl implements ICmanagementDao {

	@Override
	
	//客户分页
	public List<Cmanagement> QueryCmanagementLimit(int nowpage) {
		List<Cmanagement> list = new ArrayList<>();
		// 从数据库获取数据
		Connection conn = null;
		PreparedStatement pStatement = null;
		ResultSet set = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return null;
		}
		try {
			pStatement = conn.prepareStatement("select * from custorm_view limit ?,8");
			pStatement.setInt(1, (nowpage - 1) * 8);
			set = pStatement.executeQuery();
			if (set != null) {
				while (set.next()) {
					Cmanagement cmanagement = new Cmanagement();
					cmanagement.setCustomerID(set.getInt("customerID"));
					cmanagement.setCustomerName(set.getString("customerName"));
					cmanagement.setLoanInformation(set.getString("loanInformation"));
					cmanagement.setCity(set.getString("city"));
					cmanagement.setPhoneNum(set.getString("phoneNum"));
					cmanagement.setState(set.getInt("state"));
					cmanagement.setApplicationTime(set.getString("applicationTime"));
					cmanagement.setCstate(set.getString("cstate"));
					list.add(cmanagement);
				}
			}
			set.close();
			pStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//查询条数
	@Override
	public int QueryCount() {
		int totalpage = 0;
		Connection conn = null;
		PreparedStatement pStatement = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return 0;
		}
		try {
			pStatement = conn.prepareStatement("select count(*)as total from cmanagement");
			ResultSet set = pStatement.executeQuery();
			while (set.next()) {
				totalpage = set.getInt("total");
			}

			set.close();
			pStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalpage;

	}
	//删除客户
	@Override
	public boolean DeleteCmanagementById(int customerID) {
		Connection conn  = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {	
			
			PreparedStatement pStatement = conn.prepareStatement("delete from cmanagement where customerID="+customerID);
			
			int result = pStatement.executeUpdate();
			conn.close();
			if (result!=1) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}
	//修改客户
	@Override
	public boolean UpdateCmanagement(Cmanagement cmanagement) {
		Connection conn  = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {	
			
			PreparedStatement pStatement = conn.prepareStatement("update  cmanagement set customerName=?,loanInformation=?,city=?,phoneNum=?,state=?,applicationTime=?,cstate=? where customerID=?");
			
			int result = pStatement.executeUpdate();
			conn.close();
			if (result!=1) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}
}

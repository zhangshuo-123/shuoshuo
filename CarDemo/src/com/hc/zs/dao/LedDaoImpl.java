package com.hc.zs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hc.zs.bean.Led;
import com.hc.zs.db.DBUtils;

public class LedDaoImpl implements ILedDao {
	//故障灯查询
	@Override
	public List<Led> QueryLedLimit(int nowpage) {
		List<Led> list = new ArrayList<>();
		Led led=null;
		Connection conn=null;
		PreparedStatement pStatement=null;
		// 从数据库获取数据
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return null;
		}
		try {
			pStatement = conn.prepareStatement("select*from led limit ?,8");
			pStatement.setInt(1, (nowpage - 1) * 8);
			ResultSet set = pStatement.executeQuery();
			if (set != null) {
				while (set.next()) {
					led = new Led();
					led.setLightid(set.getInt("lightid"));
					led.setTitle(set.getString("title"));
					led.setDescribe(set.getString("describe"));
					led.setCrestionTime(set.getString("crestionTime"));
					led.setCreator(set.getString("creator"));
					list.add(led);
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

	/**
	 * 查询车系条数
	 * 
	 * @return
	 */
	public int QueryCount() {
		int totalpage = 0;
		Connection conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return 0;
		}
		PreparedStatement pStatement;
		try {
			pStatement = conn.prepareStatement("select count(*)as total from led");
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



	
}

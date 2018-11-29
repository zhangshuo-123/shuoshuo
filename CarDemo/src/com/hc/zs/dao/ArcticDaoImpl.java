package com.hc.zs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hc.zs.bean.Arctic;
import com.hc.zs.bean.Demio;
import com.hc.zs.db.DBUtils;

public class ArcticDaoImpl implements IArcticDao {

	/**
	 * 查询车型 分页
	 * 
	 * @param nowpage
	 * @return
	 */
	public List<Arctic> QueryArcticLimit(int nowpage) {
		List<Arctic> list = new ArrayList<>();
		// 从数据库获取数据
		Connection conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return null;
		}
		PreparedStatement pStatement;
		try {
			pStatement = conn.prepareStatement("select*from arctic limit ?,8");
			pStatement.setInt(1, (nowpage - 1) * 8);
			ResultSet set = pStatement.executeQuery();
			if (set != null) {
				while (set.next()) {
					Arctic arctic = new Arctic();
					arctic.setcID(set.getInt("cID"));
					arctic.setArctic(set.getString("arctic"));
					arctic.setCmoney(set.getString("cmoney"));
					arctic.setcTime(set.getString("cTime"));
					arctic.setArcperson(set.getString("arcperson"));
					list.add(arctic);
				}
				System.out.println(list.toString());
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
	 * 查询车型条数
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
			pStatement = conn.prepareStatement("select count(*)as total from arctic");
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

/**
 *  新增车型
 * @param arctic
 * @param cmoney
 * @param cTime
 * @param arcperson
 * @return
 */
	public boolean InsertArctic(String arctic, String cmoney, String cTime, String arcperson) {

		Connection conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {

			Statement statement = conn.createStatement();
			PreparedStatement pStatement = conn.prepareStatement("insert into arctic values(default,?,?,?,?)");
 			pStatement.setString(1, arctic);
			pStatement.setString(2, cmoney);
			pStatement.setString(3, cTime);
			pStatement.setString(4, arcperson);
			int result = pStatement.executeUpdate();
			if (result != 1) {
				return false;

			} else {
				return true;
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;

	}
  /**
   * 删除车系
   * @param dID
   * @return
   */

		public boolean DeleteArcticById(int cID) {
			Connection conn  = DBUtils.getConnection();
			if (conn == null) {
				System.out.println("连接错误");
				return false;
			}
			try {	
				
				PreparedStatement pStatement = conn.prepareStatement("delete from arctic where cID="+cID);
				
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
	
/**
 *  修改车型信息
 * @param cID
 * @param arctic
 * @param cmoney
 * @param cTime
 * @param arcperson
 */
		public boolean UpdateArctic(int cID, String arctic, String cmoney, String cTime, String arcperson) {
			Connection connection = DBUtils.getConnection();
			if (connection == null) {
				System.out.println("连接错误");
				return false;
			}
			try {	
				Statement statement = connection.createStatement();
				PreparedStatement pStatement = connection
						.prepareStatement("update demio set arctic=?,cmoney=?,cTime=?,arcperson=? where cID=?");
				pStatement.setInt(1,cID);
				pStatement.setString(2,arctic);
				pStatement.setString(3,cmoney);
				pStatement.setString(4,cTime);
				pStatement.setString(5,arcperson);
				
				int i = pStatement.executeUpdate();
				if (i==0) {
					System.out.println("修改失败");
				}
				pStatement.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
			return false;
		}









	
	

}


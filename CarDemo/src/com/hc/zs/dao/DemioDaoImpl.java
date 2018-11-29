package com.hc.zs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.hc.zs.bean.Arctic;
import com.hc.zs.bean.Demio;
import com.hc.zs.bean.Staff;
import com.hc.zs.db.DBUtils;

public class DemioDaoImpl implements IDemioDao {

	/**
	 * 查询车系 分页
	 * 
	 * @param nowpage
	 * @return
	 */
	public List<Demio> QueryDemioLimit(int nowpage) {
		List<Demio> list = new ArrayList<>();
		// 从数据库获取数据
		Connection conn = null;
		PreparedStatement pStatement = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return null;
		}

		try {
			pStatement = conn.prepareStatement("select*from demio limit ?,8");
			pStatement.setInt(1, (nowpage - 1) * 8);
			ResultSet set = pStatement.executeQuery();
			if (set != null) {
				while (set.next()) {
					Demio demio = new Demio();
					demio.setdID(set.getInt("dID"));
					demio.setAmg(set.getString("amg"));
					demio.setMoney(set.getString("money"));
					demio.setdTime(set.getDate("dTime"));
					demio.setDemperson(set.getString("demperson"));
					list.add(demio);
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
		Connection conn = null;
		PreparedStatement pStatement = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return 0;
		}
		try {
			pStatement = conn.prepareStatement("select count(*)as total from demio");
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
	// 查询车系名字

	@Override
	public List<Demio> QueryDemioNames() {
		List<Demio> demios = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pStatement = null;
		ResultSet set = null;
		Demio demio = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return null;
		}

		try {
			// 视图
			pStatement = conn.prepareStatement("select*from cars_view ");
			set = pStatement.executeQuery();
			if (set != null && set != null) {
				while (set.next()) {
					demio = new Demio();
					demio.setdID(set.getInt("dID"));
					demio.setAmg(set.getString("amg"));
					demio.setMoney(set.getString("money"));
					demios.add(demio);
				}

				return demios;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, pStatement, set);

		}
		return demios;
	}

	/**
	 * 新增车系
	 * 
	 * @param dID
	 * @param amg
	 * @param money
	 * @param dTime
	 * @param demperson
	 * @return
	 */
	public boolean InsertDemio(String amg, String money, String dTime, String demperson) {

		Connection conn = null;
		Statement statement = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {

			statement = conn.createStatement();
			PreparedStatement pStatement = conn.prepareStatement("insert into demio values(default,?,?,?,?)");
			pStatement.setString(1, amg);
			pStatement.setString(2, money);
			pStatement.setString(3, dTime);
			pStatement.setString(4, demperson);
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
	 * 
	 * @param dID
	 * @return
	 */

	public boolean DeleteDemioById(int dID) {
		Connection conn = null;
		PreparedStatement pStatement = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {

			pStatement = conn.prepareStatement("delete from demio where dID=" + dID);

			int result = pStatement.executeUpdate();
			conn.close();
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
	 * 修改车系信息
	 * 
	 * @param dID
	 * @param amg
	 * @param money
	 * @param dTime
	 * @param demperson
	 * @throws ParseException
	 */
	public boolean UpdateDemio(int dID, String amg, String money, String dTime, String demperson) {
		Connection conn = null;
		PreparedStatement pStatement = null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {
			Statement statement = conn.createStatement();
			pStatement = conn.prepareStatement("update demio set amg=?,money=?,dTime=?,demperson=? where dID=?");
			pStatement.setInt(1, dID);
			pStatement.setString(2, amg);
			pStatement.setString(3, money);
			pStatement.setString(4, dTime);
			pStatement.setString(5, demperson);

			int i = pStatement.executeUpdate();
			if (i == 0) {
				System.out.println("修改失败");
			}
			pStatement.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

}

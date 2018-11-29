package com.hc.zs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hc.zs.bean.Staff;
import com.hc.zs.db.DBUtils;

public class StaffDaoImpl implements IStaffDao {

	/**
	 * 人员登录
	 */
	public Staff checklogin(String name, String password) {
		Staff staff = null;
		Connection conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接失败···");
			return null;
		}
		try {
			PreparedStatement pStatement = conn.prepareStatement("select * from user_view where name=?and password=?");
			pStatement.setString(1, name);
			pStatement.setString(2, password);
			ResultSet set = pStatement.executeQuery();
			if (set.next()) {
				staff = new Staff();
				staff.setpID(set.getInt("pID"));
				staff.setName(set.getString("name"));
				staff.setPassword(set.getString("password"));
				staff.setSection(set.getInt("section"));
				staff.setPname(set.getString("Pname"));
			}
			set.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return staff;
	}

	
	/**
	 * 新增人员
	 * 
	 * @param name
	 * @param password
	 * @param section
	 * @param pname
	 * @return
	 */
	public boolean InsertStaff(String name, String password, int section) {

		Connection conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {

			Statement statement = conn.createStatement();
			PreparedStatement pStatement = conn.prepareStatement("insert into staff values(default,?,?,?)");
			pStatement.setString(1, name);
			pStatement.setString(2, password);
			pStatement.setInt(3, section);

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
	 * 通过Id查询人员
	 * 
	 * @param pID
	 * @return
	 */

	public boolean QueryStaffById(int pID) {

		return false;
	}

	/**
	 * 删除人员
	 * 
	 * @param pID
	 * @return
	 */
	public boolean DeleteStaffById(int pID) {
		Connection conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("连接错误");
			return false;
		}
		try {

			PreparedStatement pStatement = conn.prepareStatement("delete from staff where pID=" + pID);

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
	 * 查询人员
	 * 
	 * @return
	 */
	public List<Staff> QueryStaffLimit(int nowpage) {
		List<Staff> list = new ArrayList<>();
		// 从数据库获取数据
		Connection conn = null;
		PreparedStatement pstametn = null;
		Staff staff=null;
		conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return null;
		}
		try {
			pstametn = conn.prepareStatement("select*from user_view limit ?,8");
			pstametn.setInt(1, (nowpage - 1) * 8);
			ResultSet set = pstametn.executeQuery();
			if (set != null) {
				while (set.next()) {
					staff = new Staff();
					staff.setpID(set.getInt("pID"));
					staff.setName(set.getString("name"));
					staff.setPassword(set.getString("password"));
					staff.setSection(set.getInt("section"));
					staff.setPname(set.getString("pname"));
					list.add(staff);
				}

			}
			set.close();
			pstametn.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

/**
 * 查询人员数量
 **/
	public int QueryCount() {
		int totalpage = 0;
		Connection conn = DBUtils.getConnection();
		if (conn == null) {
			System.out.println("数据获取连接出错");
			return 0;
		}
		PreparedStatement pStatement;
		try {
			pStatement = conn.prepareStatement("select count(*)as total from staff");
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

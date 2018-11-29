package com.hc.zs.servlet.Staff;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hc.zs.bean.Staff;
import com.hc.zs.dao.ArcticDaoImpl;
import com.hc.zs.dao.StaffDaoImpl;

/**
 * Servlet implementation class InsertStaffServlet
 */
@WebServlet("/InsertStaffServlet")
public class InsertStaffServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String name=new String(request.getParameter("name").getBytes("ISO8859-1"),"utf-8");
		String password=new String(request.getParameter("password").getBytes("ISO8859-1"),"utf-8");
		String section=request.getParameter("section");
		//String pname=new String(request.getParameter("password").getBytes("ISO8859-1"),"utf-8");
		StaffDaoImpl dao=new StaffDaoImpl();
		boolean result=dao.InsertStaff(name, password, Integer.parseInt(section));
		if(result) {
			response.getWriter().print("{\"result\":\"success\",\"error\":\"新增成功\"}");
		}else {
			response.getWriter().print("{\"result\":\"success\",\"error\":\"新增失败\"}");
		}
	
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

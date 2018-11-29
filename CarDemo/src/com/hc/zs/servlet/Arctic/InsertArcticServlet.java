package com.hc.zs.servlet.Arctic;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hc.zs.bean.Demio;
import com.hc.zs.bean.Staff;
import com.hc.zs.dao.ArcticDaoImpl;

/**
 * 新增车系
 * Servlet implementation class InsertArcticServlet
 */
@WebServlet("/InsertArcticServlet")
public class InsertArcticServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String arctic=new String(request.getParameter("arctic").getBytes("ISO8859-1"),"utf-8");
		String cmoney=new String(request.getParameter("cmoney").getBytes("ISO8859-1"),"utf-8");
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sf.format(date);
		HttpSession session = request.getSession();
		Staff staff = new Staff();
		staff = (Staff) session.getAttribute("staff");
		String name = staff.getName();

  
		ArcticDaoImpl dao=new ArcticDaoImpl();
		boolean result=dao.InsertArctic(arctic, cmoney, time, name);
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

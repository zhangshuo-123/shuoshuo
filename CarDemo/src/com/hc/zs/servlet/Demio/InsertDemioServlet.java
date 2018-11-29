package com.hc.zs.servlet.Demio;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.el.parser.ParseException;

import com.hc.zs.bean.Staff;
import com.hc.zs.dao.DemioDaoImpl;

/**
 * 新增车系
 * Servlet implementation class InsertDemioServlet
 */
@WebServlet("/InsertDemioServlet")
public class InsertDemioServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String amg=new String(request.getParameter("amg").getBytes("ISO8859-1"),"utf-8");
//		String dTime=request.getParameter("dTime");
		String money=new String(request.getParameter("money").getBytes("ISO8859-1"),"utf-8");
//		String demperson=new String(request.getParameter("demperson").getBytes("ISO8859-1"),"utf-8");
//		java.sql.Date pst=java.sql.Date.valueOf(dTime);
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String time = sf.format(date);
		HttpSession session = request.getSession();
		Staff staff = new Staff();
		staff = (Staff) session.getAttribute("staff");
		String name = staff.getName();
//		DateFormat dateFormat = DateFormat.getDateInstance();
//		Date dTime = null;
//		try {
//			dTime = dateFormat.parse(dTime0);
//		} catch (java.text.ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		DemioDaoImpl dao=new DemioDaoImpl();
		boolean result=dao.InsertDemio(amg, money, time, name);
		if(result) {
			response.getWriter().print("{\"result\":\"success\",\"error\":\"新增成功\"}");
//			response.sendRedirect("/CarDemo/product/seriesEdit.jsp");
		}else {
			response.getWriter().print("{\"result\":\"success\",\"error\":\"新增失败\"}");
//			response.sendRedirect("/CarDemo/product/seriesEdit.jsp");
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

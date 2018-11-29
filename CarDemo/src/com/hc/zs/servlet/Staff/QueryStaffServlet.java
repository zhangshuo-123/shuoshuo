package com.hc.zs.servlet.Staff;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.bean.Staff;
import com.hc.zs.dao.StaffDaoImpl;
import com.hc.zs.service.IStaffService;
import com.hc.zs.service.StaffImpl;

/**
 * Servlet implementation class QueryStaffServlet
 */
@WebServlet("/QueryStaffServlet")
public class QueryStaffServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStaffService service =new StaffImpl();
		String nowpageStr=request.getParameter("nowpage");
		int nowpage=0;
		if (nowpageStr==null) {//第一页
			nowpage=1;
		} else {
			nowpage=Integer.parseInt(nowpageStr);
		}	
		List<Staff> list=service.QueryStaffLimit(nowpage);
		int total=service.QueryCount();
		System.out.println(list.toString());
		//跳转
	    request.setAttribute("list",list);
		request.setAttribute("nowpage",nowpage);
		request.setAttribute("totalpage",total%8==0 ? total/8 :total/8+1);
	    request.getRequestDispatcher("product/series01.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

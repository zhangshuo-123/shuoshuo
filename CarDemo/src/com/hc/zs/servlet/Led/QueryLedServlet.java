package com.hc.zs.servlet.Led;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.bean.Led;
import com.hc.zs.dao.LedDaoImpl;


/**
 *  * 查询故障灯
 * Servlet implementation class QueryLedServlet
 */
@WebServlet("/QueryLedServlet")
public class QueryLedServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LedDaoImpl dao=new LedDaoImpl();

		String nowpageStr=request.getParameter("nowpage");
		int nowpage=0;
		if (nowpageStr==null) {//第一页
			nowpage=1;
		} else {
			nowpage=Integer.parseInt(nowpageStr);
			
		}
		
			List<Led> list=dao.QueryLedLimit(nowpage);
			int total=dao.QueryCount();
			System.out.println(list.toString());
			//跳转
			
		request.setAttribute("led",list);
		request.setAttribute("nowpage",nowpage);
		request.setAttribute("totalpage",total%8==0 ? total/8 :total/8+1);
		request.getRequestDispatcher("guide/lamp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.hc.zs.servlet.Arctic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.bean.Arctic;
import com.hc.zs.bean.Demio;
import com.hc.zs.service.ArcticImpl;
import com.hc.zs.service.DemioImpl;
import com.hc.zs.service.IArcticService;
import com.hc.zs.service.IDemioService;



/**查询车型
 * Servlet implementation class QueryArcticServlet
 */
@WebServlet("/QueryArcticServlet")
public class QueryArcticServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询车系名字
		IDemioService service=new DemioImpl();
		List<Demio>demio=service.QueryDemioNames();
		//车型分页

		IArcticService services=new ArcticImpl();
		String nowpageStr=request.getParameter("nowpage");
		int nowpage=0;
		if (nowpageStr==null) {//第一页
			nowpage=1;
		} else {
			nowpage=Integer.parseInt(nowpageStr);
	}
			List<Arctic> list=services.QueryArcticLimit(nowpage);
			System.out.println(list.toString());
			int total=services.QueryCount();
			//跳转
		request.setAttribute("arctic",list);
		request.setAttribute("nowpage",nowpage);
		request.setAttribute("demio", demio);
		request.setAttribute("totalpage",total%8==0 ? total/8 :total/8+1);
		request.getRequestDispatcher("product/car.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

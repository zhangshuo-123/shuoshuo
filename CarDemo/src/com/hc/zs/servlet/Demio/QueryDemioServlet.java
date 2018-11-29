package com.hc.zs.servlet.Demio;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.bean.Demio;
import com.hc.zs.dao.DemioDaoImpl;
import com.hc.zs.service.DemioImpl;
import com.hc.zs.service.IDemioService;
import com.hc.zs.service.IStaffService;
import com.hc.zs.service.StaffImpl;


/**
 * 查询车系
 * Servlet implementation class QueryDemioServlet
 */
@WebServlet("/QueryDemioServlet")
public class QueryDemioServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //车型分页
			String nowpageStr=request.getParameter("nowpage");
			int nowpage=0;
			if (nowpageStr==null) {//第一页
				nowpage=1;
			} else {
				nowpage=Integer.parseInt(nowpageStr);
				
			}

			    IDemioService  service=new DemioImpl();
				List<Demio> list=service.QueryDemioLimit(nowpage);
				System.out.println(list.toString());
				int total=service.QueryCount();
				//跳转
				
			request.setAttribute("demio",list);
			request.setAttribute("nowpage",nowpage);
			request.setAttribute("totalpage",total%8==0 ? total/8 :total/8+1);
			request.getRequestDispatcher("product/series.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

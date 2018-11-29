package com.hc.zs.servlet.Arctic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.dao.ArcticDaoImpl;

/**
 * 修改车系
 * Servlet implementation class UpdateDemioServlet
 */
@WebServlet("/UpdateArcticServlet")
public class UpdateArcticServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 获取参数的dID
		**调用Dao层的修改方法
		 *判断结果
		 *页面跳转
		 */
			String cID=request.getParameter("cID");
			String arctic=request.getParameter("arctic");
			String cmoney=request.getParameter("cmoney");
			String cTime=request.getParameter("cTime");
			String arcperson=request.getParameter("arcperson");
			ArcticDaoImpl dao=new ArcticDaoImpl();
			boolean result=dao.UpdateArctic(Integer.parseInt(cID), arctic, cmoney, cTime, arcperson);
			if(result) {
				response.getWriter().print("{\"result\":\"success\",\"error\":\"修改成功\"}");
			}else {
				response.getWriter().print("{\"result\":\"success\",\"error\":\"修改失败\"}");
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

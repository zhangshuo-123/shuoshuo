package com.hc.zs.servlet.Arctic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hc.zs.service.ArcticImpl;
import com.hc.zs.service.IArcticService;


/**
 * 删除车系
 * Servlet implementation class DeleteDemioServlet
 */
@WebServlet("/DeleteArcticServlet")
public class DeleteArcticServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 获取参数的dID
		**调用Dao层的删除方法
		 *判断结果
		 *页面跳转
		 */
			String cID=request.getParameter("cID");
			if (cID != null) {
			IArcticService service =new ArcticImpl();
			boolean result=service.DeleteArcticById(Integer.parseInt(cID));
			if (result) {
				response.sendRedirect("QueryArcticServlet");
			}else {
			response.getWriter().println("删除失败，请重新尝试");}
		} else {
			System.out.println("cID=null");
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

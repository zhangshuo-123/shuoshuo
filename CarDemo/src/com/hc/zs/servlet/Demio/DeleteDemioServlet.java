package com.hc.zs.servlet.Demio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hc.zs.dao.DemioDaoImpl;
import com.hc.zs.service.DemioImpl;
import com.hc.zs.service.IDemioService;

/**
 * 删除车系 Servlet implementation class DeleteDemioServlet
 */
@WebServlet("/DeleteDemioServlet")
public class DeleteDemioServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 获取参数的dID 调用Dao层的删除方法 判断结果 页面跳转
		 */

		String dID = request.getParameter("dID");
		if (dID != null) {
			IDemioService service = new DemioImpl();
			boolean result = service.DeleteDemioById(Integer.parseInt(dID));
			if (result) {
				response.sendRedirect("QueryDemioServlet");
			}else {
			response.getWriter().println("删除失败，请重新尝试");}
		} else {
			System.out.println("dID=null");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

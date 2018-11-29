package com.hc.zs.servlet.Cmanagement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.service.CmanagementImpl;
import com.hc.zs.service.ICmanagementService;

/**
 * Servlet implementation class DeleteCmanagementServlet
 */
@WebServlet("/DeleteCmanagementServlet")
public class DeleteCmanagementServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerID=request.getParameter("customerID");
		if (customerID != null) {
		ICmanagementService service =new CmanagementImpl();
		boolean result=service.DeleteCmanagementById(Integer.parseInt(customerID));
		if (result) {
			response.sendRedirect("QueryCmanagementServlet");
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

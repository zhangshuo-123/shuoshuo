package com.hc.zs.servlet.Staff;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hc.zs.service.IStaffService;
import com.hc.zs.service.StaffImpl;

/**
 * Servlet implementation class DeleteStaffServlet
 */
@WebServlet("/DeleteStaffServlet")
public class DeleteStaffServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pID=request.getParameter("pID");
		if (pID != null) {
		IStaffService service =new StaffImpl();
		boolean result=service.DeleteStaffById(Integer.parseInt(pID));
		if (result) {
			response.sendRedirect("QueryStaffServlet");
		}else {
		response.getWriter().println("删除失败，请重新尝试");}
	} else {
		System.out.println("pID=null");
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

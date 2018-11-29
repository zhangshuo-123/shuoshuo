package com.hc.zs.servlet.Staff;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.dao.StaffDaoImpl;


/**
 * Servlet implementation class QueryStaffByIdServlet
 */
@WebServlet("/QueryStaffByIdServlet")
public class QueryStaffByIdServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String id=request.getParameter("id");
	//	StaffDaoImpl dao=new StaffDaoImpl();
		//boolean result=dao.deleteById(Integer.parseInt(id));
//		if (result) {
//
//			response.sendRedirect("QueryServlet");
//		} else {
//			response.sendRedirect("error.jsp");
//		}
//	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

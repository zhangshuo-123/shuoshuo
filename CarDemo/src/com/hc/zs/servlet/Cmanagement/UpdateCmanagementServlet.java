package com.hc.zs.servlet.Cmanagement;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hc.zs.bean.Cmanagement;
import com.hc.zs.service.CmanagementImpl;
import com.hc.zs.service.ICmanagementService;

/**
 * Servlet implementation class UpdateCmanagementServlet
 */
@WebServlet("/UpdateCmanagementServlet")
public class UpdateCmanagementServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String csid=request.getParameter("customerID");
		int customerID= Integer.parseInt(csid);
		String customerName= request.getParameter("customerName");
		String loanInformation = request.getParameter("loanInformation");
		String city = request.getParameter("city");
		String phoneNum = request.getParameter("phoneNum");
		String stid=request.getParameter("state");
		int state = Integer.parseInt(stid);
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String applicationTime  = dateFormat.format(date);
		String cstate = request.getParameter("cstate");
		Cmanagement  cmanagement = new Cmanagement();
		cmanagement.setCustomerID(customerID);;
		cmanagement.setCustomerName(customerName);;
		cmanagement.setLoanInformation(loanInformation);;
		cmanagement.setCity(city);;
		cmanagement.setPhoneNum(phoneNum);;
		cmanagement.setState(state);
		cmanagement.setApplicationTime(applicationTime);
		cmanagement.setCstate(cstate);
		ICmanagementService cmanagementservice = new CmanagementImpl();
		boolean result = cmanagementservice.UpdateCmanagement(cmanagement);
		if (result) {
			response.getWriter().print("{\"result\":\"true\",\"error\":\"修改成功\"}");
		}else {
			response.getWriter().print("{\"result\":\"false\",\"error\":\"修改失败\"}");
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

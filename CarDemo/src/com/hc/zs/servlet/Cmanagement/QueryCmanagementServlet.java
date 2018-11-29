package com.hc.zs.servlet.Cmanagement;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hc.zs.bean.Cmanagement;
import com.hc.zs.service.CmanagementImpl;
import com.hc.zs.service.ICmanagementService;


/**
 * Servlet implementation class QueryCmanagementServlet
 */
@WebServlet("/QueryCmanagementServlet")
public class QueryCmanagementServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //客户分页
		String nowpageStr=request.getParameter("nowpage");
		int nowpage=0;
		if (nowpageStr==null) {//第一页
			nowpage=1;
		} else {
			nowpage=Integer.parseInt(nowpageStr);
			
		}

		    ICmanagementService  service=new CmanagementImpl();
			List<Cmanagement> list=service.QueryCmanagementLimit(nowpage);
			System.out.println(list.toString());
			int total=service.QueryCount();
			//跳转
			
		request.setAttribute("cmanagement",list);
		request.setAttribute("nowpage",nowpage);
		request.setAttribute("totalpage",total%8==0 ? total/8 :total/8+1);
		request.getRequestDispatcher("customer/customer.jsp").forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

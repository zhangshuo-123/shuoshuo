package com.hc.zs.servlet.Staff;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hc.zs.bean.Staff;
import com.hc.zs.service.IStaffService;
import com.hc.zs.service.StaffImpl;


/**
 * 登录
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//判断验证码
		response.setContentType("text/html;charset=utf-8");
		String piccode = (String) request.getSession().getAttribute("piccode");
		String checkcode = request.getParameter("checkcode");
		if (!checkcode.equals(piccode)) {
			response.getWriter().print("{\"result\":\"error\",\"mgs\":\"请输入正确的验证码\"}");
			return;
		} 
		//获取名字密码参数等
		String pId=request.getParameter("pId");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		//调用service层方法进行登录
		IStaffService service=new StaffImpl();
		Staff staff=service.checklogin(name, password);
		
		if (staff!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("staff", staff);
			session.setAttribute("Pname", staff.getPname());
			
			Cookie cookie=new Cookie("name",staff.getName());
			Date date=new Date(System.currentTimeMillis());
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
			Cookie cookie2=new Cookie("date", dateFormat.format(date));
			cookie.setMaxAge(60*60*24*7);//最大有效期  一个星期
			cookie2.setMaxAge(60*60*24*7);//最大有效期  一个星期
			response.addCookie(cookie);
			response.addCookie(cookie2);
			session.setAttribute("last",dateFormat.format(date));
			response.getWriter().print("{\"result\":\"success\"}");


		} else {
			
			response.getWriter().print("{\"result\":\"error\",\"msg\":\"查无此用户，请确认后在登录\"}");

		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

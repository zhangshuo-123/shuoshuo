package com.hc.zs.servlet.Staff;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 生成验证码
 * Servlet implementation class ServletImage
 */
@WebServlet("/ServletImage")
public class ServletImage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 验证码是通过img标签触发的，所以是get方式，重写servlet方法： /*
		/*
		 * BufferedImage(int width, int height, int imageType) 构建了一个
		 * BufferedImage一个预定义的图像类型。 TYPE_INT_RGB 代表8位RGB分量包装成整数像素的图像。
		 */
		BufferedImage bi = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		Color c = new Color(200, 150, 255);
		g.setColor(c);// 背景颜色
		g.fillRect(0, 0, 68, 22);// 背景框 //字母数字组合：
		char[] ch = "ABCDEFGHIJKLMNOPQRSTUVEXYZ0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
		Random r = new Random();
		int len = ch.length;
		int index;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			index = r.nextInt(len);// 随机获得一个起始位置
			g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)));// 给字体一个随机的颜色
			g.drawString(ch[index] + "", (i * 15) + 3, 18);
			sb.append(ch[index]);
		}
		request.getSession().setAttribute("piccode", sb.toString());// 将生产的验证码保存下来，以便之后的检验输入是否一致
		ImageIO.write(bi, "JPG", response.getOutputStream());
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

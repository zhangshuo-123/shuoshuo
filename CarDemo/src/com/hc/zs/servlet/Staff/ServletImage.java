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
 * ������֤��
 * Servlet implementation class ServletImage
 */
@WebServlet("/ServletImage")
public class ServletImage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��֤����ͨ��img��ǩ�����ģ�������get��ʽ����дservlet������ /*
		/*
		 * BufferedImage(int width, int height, int imageType) ������һ��
		 * BufferedImageһ��Ԥ�����ͼ�����͡� TYPE_INT_RGB ����8λRGB������װ���������ص�ͼ��
		 */
		BufferedImage bi = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		Color c = new Color(200, 150, 255);
		g.setColor(c);// ������ɫ
		g.fillRect(0, 0, 68, 22);// ������ //��ĸ������ϣ�
		char[] ch = "ABCDEFGHIJKLMNOPQRSTUVEXYZ0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
		Random r = new Random();
		int len = ch.length;
		int index;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			index = r.nextInt(len);// ������һ����ʼλ��
			g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)));// ������һ���������ɫ
			g.drawString(ch[index] + "", (i * 15) + 3, 18);
			sb.append(ch[index]);
		}
		request.getSession().setAttribute("piccode", sb.toString());// ����������֤�뱣���������Ա�֮��ļ��������Ƿ�һ��
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

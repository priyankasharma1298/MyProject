package com.myprojectcode;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieAddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException ,ServletException{
		int data1 =Integer.parseInt(req.getParameter("num1"));
		int data2 =Integer.parseInt(req.getParameter("num2"));
		
		int sum = data1 + data2;
		
		Cookie cookie = new Cookie("sum",sum + "");
		res.addCookie(cookie);
		
		res.sendRedirect("cooksq");
		
		
		
		
	}

}

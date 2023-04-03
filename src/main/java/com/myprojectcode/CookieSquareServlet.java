package com.myprojectcode;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieSquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException ,ServletException{
		Cookie cookies[] = req.getCookies();
		
		int sum =0;
		
		for(Cookie c : cookies) 
		{
			if (c.getName().equals("sum"))
			{
				sum = Integer.parseInt( c.getValue());			
				}
		}
		
		sum = sum*sum;
		PrintWriter out = res.getWriter();
	   	out.println("result square :"+sum);
	}

}

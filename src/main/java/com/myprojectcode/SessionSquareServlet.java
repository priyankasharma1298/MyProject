package com.myprojectcode;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionSquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		
		int s = (int) session.getAttribute("s");// get value of s from sessionaddservlet
		
		s = s*s;
		
		PrintWriter out = res.getWriter();
	   	out.println("result of square of s:"+s);
	   	System.out.println("s");
	}

}

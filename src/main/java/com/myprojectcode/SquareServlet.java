package com.myprojectcode;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	
	public  void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int mysum = (int) req.getAttribute("mysum");
		int mysquare = mysum*mysum;
		PrintWriter out = res.getWriter();
		out.println("result square:"+ mysquare);
		
	}

}

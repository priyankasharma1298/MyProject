package com.myprojectcode;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MultiplyServlet  extends HttpServlet {
	
	public  void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
		
		
		int myminus = Integer.parseInt( req.getParameter("myminus"));
		
		int mul = myminus * 2;
		
		PrintWriter out = res.getWriter();
	   	out.println("result multiply with 2:"+mul);
		
		
		System.out.println("sq vcalled");
		
		
	}

}

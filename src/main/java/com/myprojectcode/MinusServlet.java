package com.myprojectcode;

import java.io.IOException;


public class MinusServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		int data1 = Integer.parseInt( req.getParameter("num1"));
		int data2 = Integer.parseInt( req.getParameter("num2"));
		
		int myminus = data1 - data2;
		
		
		// call minusServlet to multiplyServlet using sendRedirect
		
		res.sendRedirect("multiply?myminus=" +myminus );  // url rewritting
		
		
		
		
	}

}

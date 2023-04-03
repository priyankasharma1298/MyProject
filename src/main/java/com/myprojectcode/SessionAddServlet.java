package com.myprojectcode;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionAddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int data1 = Integer.parseInt( req.getParameter("num1"));
		int data2 = Integer.parseInt( req.getParameter("num2"));
		
		int s = data1 + data2;
		
		// session is created
		HttpSession session = req.getSession();
		session.setAttribute("s", s);
		
		// redirect to SessionSquareServlet
		res.sendRedirect("sessionSquare");
		
		
		
		
	}

}

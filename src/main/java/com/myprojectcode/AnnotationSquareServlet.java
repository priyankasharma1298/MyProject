package com.myprojectcode;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/annotationSquare")
public class AnnotationSquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		
		int sum = (int) session.getAttribute("sum");// get value of s from sessionaddservlet
		
		int square = sum * sum;
		
		PrintWriter out = res.getWriter();
	   	out.println("result of square of s:"+square);
		
	}

}

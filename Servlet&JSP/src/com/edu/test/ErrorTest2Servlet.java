package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorTest2")
public class ErrorTest2Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		try {
			String getquery=req.getQueryString();
			out.print("Query : "+getquery+"<br>");
			out.print("Query 길이 : "+getquery.length()+"<br>");
			
		} catch (Exception e) {
			out.print("요청을 처리하는 동안 오류가 발생하였습니다 : "+e+"<br>");
			
		}
		
		out.print("Done!!");
		out.close();
	}
}

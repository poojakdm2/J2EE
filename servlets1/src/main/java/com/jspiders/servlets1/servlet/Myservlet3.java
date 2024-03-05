package com.jspiders.servlets1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myservlet3")
public class Myservlet3 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
      PrintWriter writer = resp.getWriter();
      writer.println("<h1>Response from muservlet3</h1>");
      RequestDispatcher requestDispatcher = req.getRequestDispatcher("My_Servlet4");
     
      requestDispatcher.include(req, resp);
      
	}

}

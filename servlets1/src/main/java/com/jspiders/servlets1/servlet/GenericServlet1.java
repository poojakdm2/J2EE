package com.jspiders.servlets1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlet1 extends GenericServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       res.setContentType("text/html");
       PrintWriter writer = res.getWriter();
       writer.println("<h1>Hello world!</h1>");
	}

}

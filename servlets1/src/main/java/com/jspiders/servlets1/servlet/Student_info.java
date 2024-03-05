package com.jspiders.servlets1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/student")
public class Student_info extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
	    String mobile=req.getParameter("mobile");
	    int age=Integer.parseInt(req.getParameter("age"));
	    
	    resp.setContentType("text/html");
	    PrintWriter writer = resp.getWriter();
	    writer.println("id "+id+"<br>");
	    writer.println("name "+ name+"<br>");
	    writer.println("email "+ email+"<br>");
		writer.println("mobile "+mobile+"<br>");
		writer.println("age"+age+"<br>");
		writer.println("Courses");
		String[] courses = req.getParameterValues("courses");
	   for(int i=0;i<courses.length;i++)
	   {
		   writer.println(courses[i]+"<br>");
	   }
		
	}

}

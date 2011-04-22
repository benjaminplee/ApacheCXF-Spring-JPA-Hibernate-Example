package com.yardspoon.cxfspringjpa.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StatusServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head><title>Apache CXF, Spring, JPA, Hibernate Example Service</title></head>");
		writer.println("<body><h1>The service is up!</h1><p>Try going to <a href=\"./services/\">~/services</a> to see what services are deployed.</p></body>");
		writer.println("</html>");

		writer.close();
	}

}

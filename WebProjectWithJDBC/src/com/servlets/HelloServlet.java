package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	// @Override
	// public void init() throws ServletException {
	// System.out.println("In init method");
	// }
	//
	// @Override
	// protected void service(HttpServletRequest req, HttpServletResponse resp)
	// throws ServletException, IOException {
	// System.out.println("In service method");
	// }
	//
	// @Override
	// public void destroy() {
	// System.out.println("In destroy method");
	// }
	
	// doGet method is called by default from web browser
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In doGet method");
		resp.setContentType("text/html");
		PrintWriter abcd=resp.getWriter();
		abcd.print("Time is:"+new Date());
	}

}

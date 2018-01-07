package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDataInput extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Welcome to Servlet");
		String userName = req.getParameter("uname");
		String userPwd = req.getParameter("pwd");

		DataComparision dc = new DataComparision();
		boolean inValid = dc.validateUserInput(userName, userPwd);
		System.out.println(inValid);
		if (inValid) {
			System.out.println("User Entered Valid Data");
			resp.sendRedirect("success.html");
		} else {
			System.out.println("User Entered inValid Data");
			resp.sendRedirect("index.html");
		}

	}
}

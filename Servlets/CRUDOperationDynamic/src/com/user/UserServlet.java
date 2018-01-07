package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<UserBean> blist=new ArrayList<UserBean>();
		System.out.println("hello");
		response.setContentType("text/html");
		String hidden= request.getParameter("hiddenmsg");
		
		if(hidden.equals("Create User")){
			UserBean userbean=new UserBean();
			UserDao userdao=new UserDao();
			userbean.setUserName(request.getParameter("uname"));
			userbean.setSex(request.getParameter("sex"));
			userbean.setDOB(request.getParameter("dob"));
			userbean.setAddress(request.getParameter("add"));
			userbean.setState(request.getParameter("state"));
			userbean.setCountry(request.getParameter("country"));
		    userbean.setContactNo(request.getParameter("contact"));
			System.out.println("hello1");
			userdao.createUserID(userbean);
			RequestDispatcher rd=request.getRequestDispatcher("Home.html");
			rd.forward(request,response);
	    }
		
		if(hidden.equals("View")){
			UserBean userbean=new UserBean();
			String id=request.getParameter("vr");
			int userid=Integer.parseInt(id);
			userbean.setUserID(userid);
			blist=UserDao.viewUserDetails(userbean);
			request.setAttribute("arraylst",blist);
            RequestDispatcher rd=request.getRequestDispatcher("ViewUserDetails.jsp");
			rd.forward(request,response);
		}
		
		if(hidden.equals("Submit")){
			UserBean pb=new UserBean();
			UserDao pd=new UserDao();
			System.out.println(request.getParameter("id"));
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String sex=request.getParameter("sex");
			String dob=request.getParameter("dob");
			String add=request.getParameter("add");
			String state=request.getParameter("state");
			String country=request.getParameter("country");
			String contact=request.getParameter("contact");
			pb.setUserID(id);
			pb.setUserName(name);
			pb.setSex(sex);
			pb.setDOB(dob);
			pb.setAddress(add);
			pb.setState(state);
			pb.setCountry(country);
			pb.setContactNo(contact);
			pd.updateUser(pb);
			RequestDispatcher rd=request.getRequestDispatcher("Success.html");
			rd.forward(request,response);
		}
	}

}

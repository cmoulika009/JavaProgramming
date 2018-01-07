<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.user.UserBean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<b>EDIT USER DETAILS</b><br/><br/>					
<form name="test" action="UserServlet" method="post">
<%!UserBean pb=new UserBean();%>
<%String id=request.getParameter("id");
String name=request.getParameter("name");
String sex=request.getParameter("sex");
String dob=request.getParameter("dob");
String add=request.getParameter("add");
String state=request.getParameter("state");
String country=request.getParameter("country");
String contact=request.getParameter("contact");
pb.setUserID(Integer.parseInt(id));
pb.setUserName(name);
pb.setSex(sex);
pb.setDOB(dob);
pb.setAddress(add);
pb.setState(state);
pb.setCountry(country);
pb.setContactNo(contact);
%>

<table  border="1" cellpadding="5">
<tr>
<td><b>User ID</b></td>
<td><%=pb.getUserID()%></td>
</tr>
<tr>
<td><b>User Name</b></td>
<td><input type="text" value="<%= pb.getUserName()%>" name="name"></input></td>
</tr>
<tr>
<td><b>Sex</b></td>
<td><input type="text" value="<%= pb.getSex()%>" name="sex"></input></td>
</tr>
<tr>
<td><b>DOB</b></td>
<td><input type="text" value="<%= pb.getDOB()%>" name="dob"></input></td>
</tr>
<tr>
<td><b>Address</b></td>
<td><input type="text" value="<%= pb.getAddress()%>" name="add"></input></td>
</tr>
<tr>
<td><b>State</b></td>
<td><input type="text" value="<%= pb.getState()%>" name="state"></input></td>
</tr>
<tr>
<td><b>Country</b></td>
<td><input type="text" value="<%= pb.getCountry()%>" name="country"></input></td>
</tr>
<tr>
<td><b>Contact No.</b></td>
<td><input type="text" value="<%= pb.getContactNo()%>" name="contact"></input></td>
</tr>

</table>

<input type="submit" Value="Submit" >
<input type="submit" Value="Reset">
<input type="hidden" Value="Submit" name="hiddenmsg"/>
<input type="hidden" value="<%=pb.getUserID()%>" size="20" name="id" >
</form>
</div>
</body>
</html>
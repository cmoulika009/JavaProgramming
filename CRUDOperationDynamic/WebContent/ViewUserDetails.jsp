<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<%@page import="com.user.UserBean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<b>USER DETAILS</b>					
<form name="test" action="UserEdit.jsp">
<%!ArrayList<UserBean> blist=new ArrayList<UserBean>();%>
<% blist=(ArrayList<UserBean>)request.getAttribute("arraylst");%>

<table  border="1" cellpadding="5">
<%for(UserBean pb:blist){ %>
<tr>
<td><b>User ID</b></td>
<td><%=pb.getUserID()%></td>
</tr>
<tr>
<td><b>User Name</b></td>
<td><%= pb.getUserName()%></td>
</tr>
<tr>
<td><b>Sex</b></td>
<td><%= pb.getSex()%></td>
</tr>
<tr>
<td><b>DOB</b></td>
<td><%= pb.getDOB()%></td>
</tr>
<tr>
<td><b>Address</b></td>
<td><%= pb.getAddress()%></td>
</tr>
<tr>
<td><b>State</b></td>
<td><%= pb.getState()%></td>
</tr>
<tr>
<td><b>Country</b></td>
<td><%= pb.getCountry()%></td>
</tr>
<tr>
<td><b>Contact No.</b></td>
<td><%= pb.getContactNo()%></td>
</tr>
<input type="hidden" value="<%=pb.getUserID()%>" size="20" name="id" >
<input type="hidden" value="<%= pb.getUserName()%>" name="name" >
<input type="hidden" value="<%=pb.getSex()%>" size="20" name="sex" >
<input type="hidden" value="<%= pb.getDOB()%>" name="dob" >
<input type="hidden" value="<%= pb.getAddress()%>" name="add" >
<input type="hidden" value="<%=pb.getState()%>" size="20" name="state" >
<input type="hidden" value="<%= pb.getCountry()%>" name="country" >
<input type="hidden" value="<%=pb.getContactNo()%>" size="20" name="contact" >

<% } %>


<td><input type="submit" Value="Edit details"></input></td>
<td><input type="submit" Value="Submit" disabled="true"></td>

</tr>

</table><br/>
<a href="Home.html"><font size=4 face="cambria">Back to home page</font></a>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<%@page import="com.user.UserBean" %>
<%@page import="com.user.UserDao"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Manage Users</h1>
<form name="test" action="UserServlet" method="post">
<%!UserDao user=new UserDao(); List<UserBean> ub=user.viewUser();%>

<table border="1">
<thead> 
<th>Select</th>
<th>User ID</th>
<th>User Name</th>
</thead>
<% for(int i =0; i <ub.size(); i++) { %>
<tr>
<td><input type="radio" name="vr" value="<%=ub.get(i).getUserID()%>"></td>
<td> <%= ub.get(i).getUserID()%> </td>
<td> <%= ub.get(i).getUserName()%> </td>
</tr>
<% } %>
</table> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<BR/>
<input type="submit" value="View" name="view"></input>
<input type="hidden" value="View" name="hiddenmsg"/>
</form>
</div>
</body>
</html>
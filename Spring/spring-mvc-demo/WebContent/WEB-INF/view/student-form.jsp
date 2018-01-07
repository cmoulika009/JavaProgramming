<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Page</title>
</head>
<body>

	<!-- When form is loaded Spring MVC calls getFirstName() & getLastName() -->
	<!-- When form is submitted Spring MVC calls setFirstName() & setLastName() -->

	<form:form action="processForm" modelAttribute="student">
   
   First Name:<form:input path="firstName" />
   Last Name:<form:input path="lastName" />
		
		<br />
		<br />

		<form:select path="country">
			<!--<form:option value="India" label="India"></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="USA" label="USA"></form:option>-->

			<!-- Get list of dropdown values from Java class defined in LinkedHashMap -->
			<form:options items="${student.countryList}"></form:options>
		</form:select>
		
		<br />
		<br />
		
		Gender:
			Male <form:radiobutton path="gender" value="Male" />
			Female <form:radiobutton path="gender" value="Female" />

		<br />
		<br />
	   	
	   	Programming Language:
	   		Java <form:checkbox path="language" value="Java" />
	   		PHP <form:checkbox path="language" value="PHP" />
	   		C# <form:checkbox path="language" value="C#" />
		<input type="submit" value="submit" />

	</form:form>
</body>
</html>
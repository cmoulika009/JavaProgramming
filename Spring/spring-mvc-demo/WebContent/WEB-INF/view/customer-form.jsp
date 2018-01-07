<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Tag Library For Tags -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Customer Registration Page</title>

<style>
.error {
	color: red
}
</style>

</head>
<body>

	<!-- When form is loaded Spring MVC calls getFirstName() & getLastName() -->
	<!-- When form is submitted Spring MVC calls setFirstName() & setLastName() -->

	<i>Fill out all required fields</i>

	<br>
	<br>

	<form:form action="processForm" modelAttribute="customer">
   
   First Name:<form:input path="firstName" />
		<br>
		<br>
   Last Name*:<form:input path="lastName" />

		<!-- cssClass gives a CSS style for error message -->
		<form:errors path="lastName" cssClass="error" />

		<br>
		<br>
   Free Passes*:<form:input path="freePasses" />
		<!-- cssClass gives a CSS style for error message -->
		<form:errors path="freePasses" cssClass="error" />

		<br>
		<br>
   ZipCode*:<form:input path="zipcode" />
		<!-- cssClass gives a CSS style for error message -->
		<form:errors path="zipcode" cssClass="error" />
		
		<br>
		<br>
   CouseCode*:<form:input path="courseCode" />
		<!-- cssClass gives a CSS style for error message -->
		<form:errors path="courseCode" cssClass="error" />

		<br />
		<input type="submit" value="submit" />

	</form:form>
</body>
</html>
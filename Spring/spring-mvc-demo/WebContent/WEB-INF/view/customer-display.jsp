<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- This JSTL tag is used to get & print array values -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Confirmation Page</title>
</head>
<body>

	<!-- This call getter methods of respective attribute -->
	Customer is registered with details: ${customer.firstName}
	${customer.lastName}
	<br>
	<br> Customer requested for '${customer.freePasses}' passes
	<br>
	<br> ZipCode: ${customer.zipcode}
	<br>
	<br> Course Code: ${customer.courseCode}

</body>
</html>